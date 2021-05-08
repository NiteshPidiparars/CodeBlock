/* WAP to accept a number and check it is Multiple Harshad number or not.
   Harshad number or Niven number a number divisible by sum of its
   digits. Ex. 24
   Multiple Harshad Number : it is Harshad number that, when divided by the sum
   of its digits, produces another harshad number.
   Ex. 756 is a multiple harshad number as it gives quotient 42 on division
   by th sum (i.e. 18). */
import java.util.*;
public class EmployeFuntions
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,div,digit,s1=0,q,s2=0;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        s1 = sum(n);
        if(n%s1 == 0){
            q = n/s1;
            s2 = sum(n);
            if(q%s2 == 0)
                System.out.println("It is multiple harshad");
            else
                System.out.println("It is Harshad but not multiple harshad");
        }else{
            System.out.println("It is not even harshad");
        }
    }
    static int sum(int n)
    {
        int div,digit,s=0;
        for(div=n;div>0;div/=10){
            digit = div%10;
            s += digit;
        }
        return s;
    }
}
