import java.util.*;
class HeronsFormula
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        double a,b,c,s,p,ar;
        System.out.println("Enter three number: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        p=a+b+c;
        s=p/2;
        ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("HeronsFormula are : "+ar);
    }
}
