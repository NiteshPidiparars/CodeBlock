import java.util.*;
class fibonacciRecursive
{
    static int fibo(int n)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        else
            return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Fibonacci series is: ");
        for(int i=0;i<n;i++){
        System.out.println(fibo(i)+"\t");
        }
    }
}

