import java.util.*;
class ArmstrongNumber
{
    public static void main(String[]args)
    {
        int n,sum=0,r,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        temp=n;
        while(temp!=0)
        {
            r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
        }
        if(n==sum)
            System.out.println("Number is ArmstrongNumber");
        else
            System.out.println("Number is not ArmstrongNumber");
    }
}
