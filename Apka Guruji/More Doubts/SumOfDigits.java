/* Find sum of digits of a number using a recursive function. */
import java.util.*;
public class SumOfDigits
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,s;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        s = sum(n);
        System.out.println("Sum is : "+s);
    }
    static int sum(int n)
    {
        if(n<10)
            return n;
        else
            return n%10 + sum(n/10);
    }
}
