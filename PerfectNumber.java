import java.util.*;
class PerfectNumber
{
    int num;
    PerfectNumber(int mn)
    {
        num=mn;
    }
    int sum_of_factorial(int i)
    {
        if(i==num)
            return 0;
        else if(num%i!=0)
            return sum_of_factorial(i+1);
        else
            return i+sum_of_factorial(i+1);
    }
    void check()
    {
        int s;
        s=sum_of_factorial(1);
        if(s==num)
            System.out.println("its PerfectNumber");
        else
            System.out.println("its not PerfectNumber");
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        PerfectNumber pn=new PerfectNumber(n);
        pn.check();
    }
}
