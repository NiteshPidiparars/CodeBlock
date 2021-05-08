/* What is IO Exception that we write while
   accepting input from user using BufferReader */
import java.io.*;
public class ThrowsIOException
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:/Coad Block/Apka Guruji/More Doubts/data.txt")));
        String s;
        s = br.readLine();
        System.out.println(s);
        System.in.read();
        s = br.readLine();
        System.out.println(s);
        br.close();
    }
}
