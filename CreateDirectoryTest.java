import java.io.*;
public class CreateDirectoryTest
{
    public static void main(String[]args)
    {
        if(new File("docs").mkdir())
            System.out.println("Successfully created directory");
        else
            System.out.println("Failed to created directory");
    }
}
