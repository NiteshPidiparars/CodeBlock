import java.io.*;
public class WriteFile
{
    public static void main(String []args)throws IOException
    {

        String line=null;
        String fileName="F1.txt";
        BufferedWriter bf=null;
        try{

           FileWriter fw=new FileWriter(fileName);
            bf=new BufferedWriter(fw);
           bf.write("Hello there");
           bf.write(" here is some text");
           bf.newLine();
           bf.write(" we are writing");
           bf.write(" the text to the file");
           bf.close();
        }catch(IOException e){
           System.out.println("Error writing to file'"+fileName+"'");
        }finally{
           try{
               if(bf!=null){
                bf.close();
               }
           }catch(IOException e){
           }
        }
    }
}
