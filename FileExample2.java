import java.io.*;
public class FileExample2
{
    public static void main(String[]args)throws IOException
    {
        int ch;
        BufferedReader bf=new BufferedReader(new FileReader("C:/Coad Block/File2.txt"));
        char s[]=new char[20];
        bf.read(s,2,15);
            System.out.println(s);
        bf.close();
    }
}
