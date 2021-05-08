import java.util.*;
class CalculateInterest
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        double p,n,r,si,ci;
        System.out.println("Enter Amount: ");
        p=sc.nextDouble();
        System.out.println("Enter the number of year: ");
        n=sc.nextDouble();
        System.out.println("Enter the Rate of Interest: ");
        r=sc.nextDouble();
        si=(p*n*r)/100;
        ci=p*Math.pow(1.0+r/100.0,n)-p;
        System.out.println("Amount is: "+p);
        System.out.println("Number of Year: "+n);
        System.out.println("Rate of Interest: "+r);
        System.out.println("Compound Interest: "+ci);
        System.out.println("Simple Interest: "+si);
    }
}
