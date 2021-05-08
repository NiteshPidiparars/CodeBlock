/* Write a Java program to input 20 nos. from the
   user and display pair of consecutive nos. the
   program must not use the concept of array */
import java.util.*;
public class ConsecutiveNumbers
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,pn,i;
        System.out.println("Enter the first number : ");
        pn = sc.nextInt();
        for(i=1;i<=19;i++){
            System.out.println("Enter the next number : ");
            n = sc.nextInt();
            if(Math.abs(pn-n)==1)
                System.out.println("Prev two numbers "+pn+" and "+n+" are consecutive numbers");
            pn=n;
        }
    }
}

