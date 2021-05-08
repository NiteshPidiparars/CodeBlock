import java.io.*;
public class ReadFile
{
    public static void main(String []args)throws IOException
    {

        String line=null;
        String fileName="C:/Coad Block/File1.txt";
           FileReader fr=new FileReader("C:/Coad Block/File1.txt");
           BufferedReader bf=new BufferedReader(fr);
           while((line=bf.readLine())!=null){
            System.out.println(line);
        }
        }
    }
