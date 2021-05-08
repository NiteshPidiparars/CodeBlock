import java.util.*;
class GCDExample
{
    public static void main(String[]args)
    {
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number: ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("GCD of number: "+gcd(num1,num2));
    }
    static int gcd(int num1,int num2)
    {
        if(num2==0)
            return num1;
        return gcd(num2,num1%num2);
    }
}
