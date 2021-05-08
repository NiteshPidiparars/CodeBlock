import java.io.*;
public class CreatingFile
{
    public static void main(String[]args)
    {
        try{
        if(new File("Output.txt").createNewFile())
            System.out.println("Successfully created directory");
        else
            System.out.println("Failed to created directory");
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

