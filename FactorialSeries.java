import java.util.*;
class FactorialSeries
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,f,x,s;
        System.out.println("Enter the term you want: ");
        n=sc.nextInt();
        System.out.println("Enter the value of x: ");
        x=sc.nextInt();
        f=1;
        for(i=1;i<=x;i++)
            f=f*i;
            s=0;
        for(i=1;i<=n;i++){
            s=s+f;
            f=f*(++x)*(++x);
        }
        System.out.println("sum is: "+s);
    }
}
