import java.util.*;
class PerfectSquare
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n,r,s;
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        r=(int)Math.sqrt(n);
        s=r*r;
        if(s==n)
            System.out.println("its PerfectSquare");
        else
            System.out.println("its not PerfectSquare");
    }
}
