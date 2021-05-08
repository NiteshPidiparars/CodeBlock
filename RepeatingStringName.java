import java.util.*;
import java.io.*;
public class RepeatingStringName
{
    public static void main(String[]args)throws IOException
    {
        Scanner sc=new Scanner(System.in);
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string: ");
        String str=bf.readLine();
        System.out.println("How many time that you want to entered your name: ");
        int n=Integer.parseInt(bf.readLine());
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(str+" ");
        }
    }
}
