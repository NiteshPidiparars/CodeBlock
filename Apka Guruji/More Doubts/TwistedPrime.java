/* WAP in Java to accept a number and check it is Emirp
   Number(both side prime) or not using string.
   Example : 13 = 31 */
import java.util.*;
public class TwistedPrime
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,rev,l,i;
        String s,r="";
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        s = ""+n;
        l = s.length();
        for(i=0;i<l;i++)
            r = s.charAt(i) + r;
        rev = Integer.parseInt(r);
        if(isPrime(n) && isPrime(rev))
            System.out.println("It is an Emirp Number.");
        else
            System.out.println("It is not Emirp Number.");
    }
    public static boolean isPrime(int n)
    {
        int i;
        for(i=2;i<n;i++){
            if(n%i==0)
                break;
        }
        if(i==n)
            return true;
        else
            return false;
    }
}
