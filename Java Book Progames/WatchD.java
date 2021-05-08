/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;

import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;
import java.io.*;
import static java.nio.file.LinkOption.NOFOLLOW_LINKS;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

/**
 *
 * @author hp
 */
public class WatchD implements Runnable {

    private final WatchService watcher = FileSystems.getDefault().newWatchService();
    private final Map<WatchKey, Path> keys = new HashMap<WatchKey, Path>();
    Path src, dst;

    public WatchD(Path dir, Path dir1) throws IOException {
        src = dir;
        dst = dir1;
        register(dir);
    }


    private void register(Path dir) throws IOException {
        Files.walkFileTree(dir, new SimpleFileVisitor<Path>() {
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attr) throws IOException {
                WatchKey key = dir.register(watcher,
                        StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_MODIFY);
                keys.put(key, dir);
                return FileVisitResult.CONTINUE;
            }
        });
        new Thread(this).start();
        System.out.println("Ready");
    }

    @Override
    public void run() {
        while (true) {
            WatchKey key;
            try {
                key = watcher.take();
                System.out.println(key);
            } catch (Exception e) {
                return;
            }
            Path dir = keys.get(key);
            if (dir == null) {
                System.out.println("WatchKey Not Recognized.");
                continue;
            }
            for (WatchEvent<?> event : key.pollEvents()) {
                WatchEvent.Kind<?> kind = event.kind();
                if (kind == StandardWatchEventKinds.OVERFLOW) {
                    continue;
                }
                WatchEvent<Path> ev = (WatchEvent<Path>) event;
                Path name = ev.context();
                Path child = dir.resolve(name);
                System.out.format("%s : %s\n", event.kind().name(), child);
                Path r = src.relativize(child);
                Path to = Paths.get(dst + "/" + r);//, from = Paths.get(src+"/"+r);
                try {
                    Files.copy(child, to, REPLACE_EXISTING);
                } catch (Exception e) {
                    Path p1 = Paths.get(src.toString());
                    Path p2 = Paths.get(dst.toString());

                    for (int i = 0; i < r.getNameCount(); i++) {
                        p1 = p1.resolve(p1.getName(i));
                        p2 = p2.resolve(p2.getName(i));
                        try {
                            Files.copy(p1, p2, REPLACE_EXISTING);
                        } catch (Exception e1) {
                            System.out.println("again" + e);
                        }
                    }
                }
                if ((kind == StandardWatchEventKinds.ENTRY_CREATE) && Files.isDirectory(child, NOFOLLOW_LINKS)) {
                    try {
                        register(child);
                    } catch (Exception e3) {
                    }
                }
            }
            boolean valid = key.reset();
        }
    }


    public static void main(String[] args) throws IOException {
        new WatchD(Paths.get("C:/NAME/INSERTED/name.txt"), Paths.get("C:/NAME/INSERTED/identity.txt"));
    }
}
