import java.util.*;
class FactorialNumber
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        System.out.println("Factorial of "+a+" is "+fact(a));
    }
    static int fact(int n)
    {
        int result;
        if(n==0||n==1)
            return 1;
        result=fact(n-1)*n;
        return result;
    }
}
