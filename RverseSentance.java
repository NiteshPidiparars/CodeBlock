import java.util.*;
import java.io.*;
public class RverseSentance
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String str=bf.readLine();
        String word[]=str.split("");
        for(int i=word.length-1;i>=0;i--){
            System.out.print(word[i]+"");
        }
    }
}
