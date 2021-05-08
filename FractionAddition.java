import java.util.*;
class FractionAddition
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c,d;
        System.out.println("Enter a: ");
        a=sc.nextFloat();
        System.out.println("Enter b: ");
        b=sc.nextFloat();
        System.out.println("Enter c: ");
        c=sc.nextFloat();
        System.out.println("Enter d: ");
        d=sc.nextFloat();
        System.out.println("Fraction Addition is: [("+a+" * "+d+")+("+b+" * "+c+")/("+b+" * "+d+")]= "+(((a*d)+(b*c))/(b*d)));
    }
}
