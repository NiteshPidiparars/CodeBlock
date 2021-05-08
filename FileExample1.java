import java.io.*;
public class FileExample1
{
    public static void main(String[]args)throws IOException
    {
        int i,l;
        FileInputStream fin=new FileInputStream("C:/Coad Block/File1.txt");
        do{
            i=fin.read();
            if(i!=-1)
                System.out.println((char)i);
        }
        while(i!=-1);
        fin.close();
    }
}
