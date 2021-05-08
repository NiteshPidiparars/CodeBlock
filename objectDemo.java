import java.util.*;
public class ObjectDemo
{
        try{
        public void Exception()
        {
            try{
                int a=0;
                for(int i=0;i<10;i++)
             if(a!=0){
                System.out.println("Exception: "+getMessage());
            }
            catch(NullPointerException e)
            {
                System.out.println("Exception Occur...");
            }
        }
        System.out.println("Exception is occur..");
    }catch(Throwable ex)
    {
        ex.printStackTrace();
  }

    public static void main(String[]args)
    {
          ObjectDemo cal=new ObjectDemo();
         cal.Exception();
        }
}
}
