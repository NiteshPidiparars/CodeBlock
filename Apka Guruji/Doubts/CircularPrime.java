/*
    WAP in Java to accept a number and check if it
    is circular prime or not.
*/
import java.util.*;
public class CircularPrime
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,nd,x,i;
        boolean isPrime = true;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        nd = (n+"").length();
        x = n;
        do{
            System.out.println(x);
            for(i=2;i<x;i++)
                if(x%i == 0)
                    break;
            if(i!=x){
                isPrime = false;
                break;
            }
            x = x%10 * (int)Math.pow(10,nd-1) + x/10;
        }while(x!=n);
        if(isPrime)
            System.out.println("Yes, It is Circular Prime");
        else
            System.out.println("No, It is not Circular Prime");
    }
}
