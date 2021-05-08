import java.util.*;
class Perfect
{
    static int num;
    Perfect(int nn)
    {
        num=nn;
    }
    int sum_of_factor(int i)
    {
        if(i==num)
            return 0;
        else if(num%i!=0)
            return sum_of_factor(i+1);
        else
            return i+sum_of_factor(i+1);
    }
    void Check()
    {
        int s;
        s=sum_of_factor(1);
        if(s==num)
            System.out.println("its Perfect number.");
        else
            System.out.println("its not Perfect number.");
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        Perfect p=new Perfect(n);
        p.Check();
    }
}
