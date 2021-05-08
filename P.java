import java.util.*;
public class P
{
    public static void main(String[]args)
    {
    int i,n,sum=0,sq;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number: ");
    n=sc.nextInt();
    sq=n*n;
    for(i=sq;i>0;i=i/10)
        sum=sum+i%10;
        if(sum==n)
            System.out.println(n+" is a neon number");
        else
            System.out.println(n+" is not neon number");
    }
}

