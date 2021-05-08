/* Write a Java program to find all the Narcissistic Number between
   1 to 100. In number theory. a Narcissistic Number is a number that
   is the sum of its own digits each raised to the power of the number of digits.
   For Example :
   153 = 1^3 + 5^3 + 3^3
   370 = 3^3 + 7^3 + 0^3 */
import java.util.*;
public class NarcissisticNumber
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,div,digit,nd,s;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        nd = (n+"").length();
        s=0;
        for(div=n;div>0;div/=10){
            digit = div%10;
            s += (int)Math.pow(digit,nd);
        }
        if(s == n)
            System.out.println("It is Narcissistic Number");
        else
            System.out.println("Not Narcissistic Number");
    }
}
