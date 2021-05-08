import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.Remote;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SimpleRegistry implements Runnable{
    int port;
    Hashtable objects = new Hashtable();
    public SimpleRegistry(int prt){
        this.port = prt;
        new Thread(this).start();
    }
    public SimpleRegistry(){
        this(6789);
    }
    public void rebind(Remote o, String name){
        objects.put(name, o);
    }
    public static Object lookup(String host, int port, String name) throws Exception, IOException, ClassNotFoundException{
        Socket clientEnd = new Socket(host, port);
        PrintWriter toServer = new PrintWriter(clientEnd.getOutputStream(),true);
        toServer.println(name);
        ObjectInputStream in = new ObjectInputStream(clientEnd.getInputStream());
        return in.readObject();
    }
    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while(true){
                Socket serverEnd = serverSocket.accept();
                BufferedReader fromClient = new BufferedReader(new InputStreamReader(serverEnd.getInputStream()));
                String name = fromClient.readLine();
                Remote o = (Remote) objects.get(name);
                ObjectOutputStream out = new ObjectOutputStream(serverEnd.getOutputStream());
                out.writeObject(o);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
