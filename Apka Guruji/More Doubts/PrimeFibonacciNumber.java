/* Write a Java program to generate first 30 terms
   of the Fibonacci series in an array and then display the numbers
   which are prime.
   Use a function that checks whether the no. is prime or not. */
import java.util.*;
public class PrimeFibonacciNumber
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n=30,i,arr[];
        arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for(i=2;i<n;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println("The Prime Fibonacci Numbers are : ");
        for(i=0;i<n;i++)
            if(isPrime(arr[i]))
            System.out.print(arr[i]+" ");
    }
    static boolean isPrime(int n)
    {
        int i;
        for(i=2;i<n;i++)
            if(n%i==0)
                break;
        return i==n;
    }
}
