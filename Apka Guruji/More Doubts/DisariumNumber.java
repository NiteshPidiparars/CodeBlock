/* WAP to check whether a number is disarium number or not.
   A Disarium number is a number defined by the following process:
   ... A number will be called Disarium if the sum of its digits powered with
   their respective position is equal with the number itself. Sample Input : 135.
   Input : 135 = 1^1+3^2+5^3
               = 1+9+125
               = 135
   so it is a disarium number. */
import java.util.*;
public class DisariumNumber
{
    public static boolean isDisarium(int n)
    {
        int nd = (n+"").length();
        int div,digit,p=nd,s=0;
        for(div=n;div>0;div/=10){
            digit = div%10;
            s = s + (int)Math.pow(digit,p);
            p--;
        }
        return s==n;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        if(isDisarium(n))
            System.out.println("It is Disarium Number.");
        else
            System.out.println("Not Disarium Number.");
    }
}
