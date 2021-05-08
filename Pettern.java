import java.util.*;
class Pettern
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int i,n,sign=1;
        double x,s;
        System.out.println("Enter the value of n and x: ");
        n=sc.nextInt();
        x=sc.nextDouble();
        s=0;
        for(i=1;i<=n;i++){
            s=s+sign*(i*x)/(2*i-1);
            sign*=-1;
        }
        System.out.println("Sum of Series is: "+s);
    }
}
