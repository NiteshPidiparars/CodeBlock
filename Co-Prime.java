import java.util.*;
public class Co-Prime
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,hcf=1,i,min;
        System.out.println("Enter the two number: ");
        a=sc.nextInt();
        b=sc.nextInt();
        min=a<b?a:b;
        for(i=1;i<=min;i++)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
            }
        }
        if(hcf==1)
            System.out.println("The number is Co-prime");
        else
            System.out.println("The number is not Co-prime");
    }
}

