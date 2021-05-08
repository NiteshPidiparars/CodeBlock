/* WAP in Java to accept a number and check it is neon number or not
   (use String functions for digit extraction). */
import java.util.*;
public class NeonNumbersUsingString
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,sq,s=0;
        String str;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        sq = n*n;
        str = sq + "";
        while(str.length()>0){
            s += Integer.parseInt(str.substring(0,1));
            str = str.substring(1);
        }
        if(s == n)
            System.out.println("It is neon number.");
        else
            System.out.println("Not neon number.");
    }
}
