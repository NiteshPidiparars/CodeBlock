/* WAP to accept a number and check faction number or not.
   (A number is a faction number, if the number is divisible by
   the sum of its prime factors.)
   Example : 180.
   180 is divisible by 2+2+3+3+5 = 15. */
import java.util.*;
public class FactionNumber
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,x,i,s=0;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        x = n;
        for(i=2;x>1;i++){
            while(x%i==0){
                s = s+i;
                x = x/i;
            }
        }
        if(n%s==0)
            System.out.println("It is a faction number.");
        else
            System.out.println("Not a faction number.");
    }
}
