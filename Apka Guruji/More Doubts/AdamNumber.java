/* Adam number is a number when reversed, the square of the number and the
   square of the reversed number should be numbers which are reverse of each other.
   Adam number under 1000 are :
   0,1,2,3,11,12,13,21,22,31,101,102,103,111,112,113,121,122,
   201,202,211,212,221,301,311. */
import java.util.*;
public class AdamNumber
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,div,digit,rn,sn,srn,rsn;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        sn = n*n;
        rn = 0;
        for(div=n;div>0;div/=10){
            digit = div%10;
            rn = rn*10 + digit;
        }
        rsn = 0;
        for(div=sn;div>0;div/=10){
            digit = div%10;
            rsn = rsn*10 + digit;
        }
        srn = rn*rn;
        System.out.println("Square of the original number : "+sn);
        System.out.println("Square of the reverse of the number : "+srn);
        if(rsn == srn)
            System.out.println("It is Adam Number.");
        else
            System.out.println("Not Adam Number.");
    }
}
