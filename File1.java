import java.io.*;
public class File1
{
    public static void main(String[]args)throws IOException
    {
        int i;
        FileInputStream fin=new FileInputStream("C:/Coad Block/Output.txt");
        do
        {
            i=fin.read();
            if(i!=-1)
                System.out.print((char)i);
        }while(i!=-1);
        fin.close();
    }
}
