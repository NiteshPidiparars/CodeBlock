/* WAP in Java to accept a number and check smith number of not.
   (A Smith number is a composite number for which, in a given base
   (in base 10 by default), the sum of its digits is equal to the sum
   of the digits in its prime factorization.
   For Example :
   378 = 2*3*3*3*7 is a Smith number
   since 3+7+8+ = 2+3+3+3+7 */
import java.util.*;
public class SmithNumber
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,x,i,spf=0,div,digit,sd=0;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        x = n;
        for(i=2;x>1;i++){
            while(x%i==0){
                spf = spf + i;
                x = x/i;
            }
        }
        for(div=n;div>0;div/=10){
            digit = div%10;
            sd += digit;
        }
        if(sd == spf)
            System.out.println("It is Smith Number.");
        else
            System.out.println("It is not Smith Number.");
    }
}
