import java.util.*;
class fibonacci
{
    public static void main(String[]args)throws Exception
    {
            int a=-1,b=1,c=0,n;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number: ");
            n=sc.nextInt();
            for(int i=1;i<=n;i++)
        {
                c=a+b;
                System.out.println("the fibonacci series is: "+c);
                a=b;
                b=c;
       }
    }
}
