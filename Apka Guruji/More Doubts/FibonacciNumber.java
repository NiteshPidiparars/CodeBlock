/* WAP in Java to store and display first N
   Fibonacci numbers in an array*/
import java.util.*;
public class FibonacciNumber
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i,arr[];
        System.out.println("How many terms you want?");
        n = sc.nextInt();
        arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for(i=2;i<n;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println("The Series is : ");
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}

