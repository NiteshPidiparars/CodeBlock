import java.io.*;
public class CreateDirectoryTest1
{
    public static void main(String[]args)
    {
        if(new File("docs1").mkdir())
            System.out.println("Successfully created file");
        else
            System.out.println("Failed to created file");
    }
}
