import java.util.*;
class Square
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int s,a,p;
        System.out.println("Enter the number: ");
        s=sc.nextInt();
        a=s*s;
        p=4*s;
        System.out.println("Area is: "+a);
        System.out.println("Perimeter is: "+p);
    }
}
