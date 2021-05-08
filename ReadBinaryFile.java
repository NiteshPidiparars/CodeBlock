import java.io.*;
public class ReadBinaryFile
{
    public static void main(String[]args)throws IOException
    {
        FileInputStream fin=new FileInputStream("C:/Coad Block/File1.txt");
            byte[] buffer =new byte[10];
            int total=0;
            int nRead=0;
            while((nRead=fin.read(buffer))!=-1)
            {
                System.out.println(new String(buffer));
                total+=nRead;
            }
            System.out.println("Read "+total+" byte");
    }
}
