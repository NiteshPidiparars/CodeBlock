/* how to find runtime error. */
import java.util.*;
public class RuntimeError
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,s,q;
        System.out.println("Enter two number : ");
        a = sc.nextInt();
        b = sc.nextInt();
        q =  a/b;//s = a+b;
        //System.out.println("Sum is : "+s);
        System.out.println("Quotient is : "+q);
    }
}
