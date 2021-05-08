import java.util.*;
class NearestPerfectSquare
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n,s;
        double r;
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        r=Math.sqrt(n);
        s=(int)Math.pow((int)Math.ceil(r),2);
        System.out.println("Perfect Square is: "+s);
    }
}
