import java.io.*;
public class DeleteFile
{
    public static boolean deleteFile(String filename)
    {
        boolean exists=new File("Output.txt").delete();
        return exists;
    }
    public static void test(String type,String filename)
    {
       System.out.println("The following " +type+ " called " +"Output.txt" +(deleteFile("Output.txt")?" was deleted.":" does not deleted" ));
    }
    public static void main(String[]args)throws IOException
    {
        test("file","Output.txt");
    }
}

