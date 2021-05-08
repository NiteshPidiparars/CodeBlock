/* Write a program to print the sum of negative numbers, sum of positive
   even number and sum of positive odd numbers from a list of number(N)
   entered by user. the list terminates when the user enters a zero. */
import java.util.*;
public class Sums
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int i,n,sn,spe,spo;
        System.out.println("Enter the numbers (0 to terminates) : ");
        n = sc.nextInt();
        sn=spe=spo=0;
        while(n!=0){
            if(n<0)
                sn += n;
            else if(n>0){
                if(n%2==0)
                    spe += n;
                else
                    spo += n;
            }
            n = sc.nextInt();
        }
        System.out.println("Sum of negative : "+sn);
        System.out.println("Sum of positive even : "+spe);
        System.out.println("Sum of positive odd : "+spo);
    }
}
