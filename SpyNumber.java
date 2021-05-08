import java.util.*;
class SpyNumber
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        if(CheckSpy(n))
            System.out.println("its SpyNumber");
        else
            System.out.println("its not SpyNumber");
    }
    static boolean CheckSpy(int n)
    {
        int digits,sum=0,p=1;
        while(n>0){
            digits=n%10;
            sum=sum+digits;
            p=p*digits;
            n=n/10;
        }
        if(sum==p)
            return true;
        else
            return false;
    }
}
