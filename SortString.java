import java.io.*;
import java.util.*;
class SortString
{
    public static void main(String[]args)throws IOException
    {
      BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
      String[] names=null;
      System.out.println("How many name that you want to sort: ");
      int size=Integer.parseInt(bf.readLine());
      names=new String[size];
      for(int i=0;i<size;i++){
        System.out.println("Enter "+(i+1)+"name");
        names[i]=bf.readLine();
      }
      Arrays.sort(names);
      System.out.println("Sorted name->");
      for(String name:names){
        System.out.println("\t"+name);
      }
    }
}
