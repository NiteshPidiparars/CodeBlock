import java.io.*;
public class DirectoryDeleteTest
{
    public static boolean deleteFile(String filename)
    {
        boolean exists=new File("C:/Coad Block/Output.txt").delete();
        return exists;
    }
    public static void test(String type,String filename)
    {
        System.out.println("The following" +type+"called"+"C:/Coad Block/Output.txt"+(deleteFile("C:/Coad Block/Output.txt")?"was deleted.":"does not deleted"));
    }
    public static void main(String[]args)throws IOException
    {
        test("directory",File.seperator+"does"+File.seperator);
    }
}
