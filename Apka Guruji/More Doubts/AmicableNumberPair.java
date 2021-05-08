/* A pair of number are amicable if the sum of factors of one number
   (excluding it self) is equal to the second number and vice verse.
   Example :
   consider a pair of number 220 and 284.
   sum of the factors of 220 = 1+2+4+5+10+11+20+22+44+55+110 = 284
   sum of the factors of 284 = 1+2+4+71+142 = 220
   so 220 and 284 are amicable. */
import java.util.*;
public class AmicableNumberPair
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,i,s1,s2;
        System.out.println("Enter the two number : ");
        a = sc.nextInt();
        b = sc.nextInt();
        s1 = 0;
        for(i=1;i<a;i++)
            if(a%i==0)
                s1 += i;
        s2 = 0;
        for(i=1;i<b;i++)
            if(b%i==0)
                s2 += i;
        if(s1 == b && s2 == a)
            System.out.println("Amicable Pair");
        else
            System.out.println("Not Amicable Pair");
    }
}
