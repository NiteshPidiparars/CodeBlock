import java.util.*;
class secondLargest
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,s,l,sl;
        System.out.println("Enter three number: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        l=Math.max(a,Math.max(b,c));
        s=Math.min(a,Math.min(b,c));
        sl=(a+b+c)-(l+s);
        System.out.println("Second Largest number is: "+sl);
    }
}
