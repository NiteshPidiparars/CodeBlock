import java.util.*;
class PrimeMenu
{
    static boolean isPrime(int n)
    {
        int i,c=0;
        for(i=1;i<=n;i++){
            if(n%i==0)
                c++;
        }
        if(c==2)
            return true;
        else
            return false;
    }
    static boolean areTwinsPrime(int a,int b)
    {
        int d;
        d=Math.abs(a-b);
        if(d==2 && isPrime(a) && isPrime(b))
            return true;
        else
            return false;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int ch,n,a,b;
        System.out.println("Select an Option: ");
        System.out.println("1.Check number is Prime or not: ");
        System.out.println("2.Check number is Twins or not: ");
        System.out.println("Enter your choice: ");
        ch=sc.nextInt();
        switch(ch)
        {
        case 1:
            System.out.println("Enter the number: ");
            n=sc.nextInt();
            if(isPrime(n))
                System.out.println("its is Prime");
            else
                System.out.println("its is not Prime");
                break;
        case 2:
            System.out.println("Enter the number: ");
            a=sc.nextInt();
            b=sc.nextInt();
            if(areTwinsPrime(a,b))
                System.out.println("its is TwinsPrime");
            else
                System.out.println("its is not TwinsPrime");
                break;
        default:
            System.out.println("Invalid Choice: ");
        }
    }
}
