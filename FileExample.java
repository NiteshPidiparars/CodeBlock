import java.io.*;
public class FileExample
{
    public static void main(String[]args)throws IOException
    {
        File f1=new File("C:/Coad Block/File.txt");
        System.out.println("can file read: "+f1.canWrite());
        System.out.println("file name: "+f1.getName());
        System.out.println("Is exist: "+f1.exists());
        System.out.println("File size: "+f1.length());
        System.out.println("Length of file: "+f1.length());
        f1.createNewFile();
        f1.delete();
    }
}
