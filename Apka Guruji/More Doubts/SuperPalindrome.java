/* WAP to accept a number and check super palindrome or not.
   (A palindrome no whose square is also palindrome is super palindrome)
   Example : 11 */
import java.util.*;
public class SuperPalindrome
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        if(isPalindrome(n) && isPalindrome(n*n))
            System.out.println("It is super palindrome.");
        else
            System.out.println("It is not super palindrome.");
    }
    static boolean isPalindrome(int n)
    {
        int div,digit,r=0;
        for(div=n;div>0;div=div/10){
            digit = div%10;
            r = r*10 + digit;
        }
        return (n==r);
    }
}
