/* WAP to display all the triangular numbers between M and N.
   (A triangular number is any of the series of number(1,3,6,10,15,
   etc.) obtained by continued summation of the natural numbers 1,
   2,3,4,5,etc.) */
import java.util.*;
public class TriangularProblem
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int m,n,x,i,s=0;
        System.out.println("Enter the number : ");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("Such number are : ");
        for(x=m;x<=n;x++){
            s=0;
            for(i=1;s<x;i++){
                s = s+i;
            }
            if(s==x)
                System.out.print(x+" ");
        }
        System.out.println();
}
/*  public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i,s=0;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        for(i=1;s<n;i++){
            s = s+i;
        }
        if(s==n)
            System.out.println("It is triangular number.");
        else
            System.out.println("It is not triangular number.");
    }  */
}
