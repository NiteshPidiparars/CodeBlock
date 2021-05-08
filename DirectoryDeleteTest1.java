import java.io.*;
public class DirectoryDeleteTest1
{
    public static boolean deleteFile(String filename)
    {
    boolean exists=new File("C:/Coad Block/docs1").delete();
    return exists;
    }
    public static void test(String type,String filename)
    {
        System.out.println("The following "+type+" called"+ " C:/Coad Block/docs1" +(deleteFile("C:/Coad Block/docs1")?" was deleted.": " does not deleted file. "));
    }
    public static void main(String[]arsg)
    {
       test("directory",File.separator+"docs1"+File.separator);
    }

}
