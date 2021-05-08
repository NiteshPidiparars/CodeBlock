import java.io.*;
public class FileExample3
{
    public static void main(String[]args)throws IOException
    {
        int ch;
        BufferedReader bf=new BufferedReader(new FileReader("C:/Coad Block/File3.txt"));
        char []s=new char[20];
        bf.read(s,0,8);
        System.out.println(s);
        bf.close();
    }
}
