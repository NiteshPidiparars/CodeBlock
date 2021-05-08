import java.util.*;
class PowerSeries
{
    static long fact(int n)
    {
        int i;
        long f=1;
        for(i=1;i<=n;i++)
            f=f*i;
        return f;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int i,n,sign,p,v,d;
        long den;
        double s,x,num;
        System.out.println("Enter the value of n and x: ");
        n=sc.nextInt();
        x=sc.nextDouble();
        sign=1;
        p=2;
        v=2;
        d=3;
        s=0;
        for(i=1;i<=n;i++){
            num=Math.pow(x,p);
            p+=2;
            den=fact(v);
            v+=d;
            d++;
            s+=sign*num/den;
            sign*=-1;
        }
        System.out.println("Sum of the series is: "+s);
    }
}
