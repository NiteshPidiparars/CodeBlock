/*
    WAP to accept a number and check it is palindrome or
    not using recursive function(Without Using loop).
*/
import java.util.*;
public class PalindromeUsingRecusive
{
    static int reverse(int n, int nd)
    {
        if(n<10)
            return n;
        else
            return n%10 * (int)Math.pow(10,nd-1) + reverse(n/10,nd-1);
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,nd;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        System.out.println("How many digits does it have?");
        nd = sc.nextInt();
        if(reverse(n,nd) == n)
            System.out.println("It is Palindrome");
        else
            System.out.println("It is not Palindrome");
    }
}
