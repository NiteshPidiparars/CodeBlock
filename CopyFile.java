import java.io.*;
public class CopyFile
{
    public static void main(String[]args)throws IOException
    {
        FileInputStream fin=null;
        FileOutputStream fout=null;
        try{
            fin=new FileInputStream("C:/Coad Block/File2.txt");
            fout=new FileOutputStream("C:/Coad Block/File2.txt");
            int c;
            while((c=fin.read())!=-1){
                fout.write(c);
            }
        }
        finally{
          if(fin!=null)
          {
              fin.close();
          }
          if(fout!=null)
          {
              fout.close();
          }
        }
    }
}
