/* WAP to accept a number and check its digits are int increasing
   order or not. */
import java.util.*;
public class OrderOfDigits
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,div,digit,pdigit;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        pdigit = n%10;
        for(div=n/10;div>0;div/=10){
            digit = div%10;
            if(digit > pdigit)
                break;
            pdigit = digit;
        }
        if(div == 0)
            System.out.println("Yes it's in increasing order.");
        else
            System.out.println("Yes it's not in increasing order.");
    }
}
