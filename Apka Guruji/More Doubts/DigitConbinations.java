/* WAP to accept any number and print all the combination by
   rotation the digits of the number in left shift passes.
   Input : 2018
   Output : 182,1820,8201? */
import java.util.*;
public class DigitConbinations
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,nd,div,i,lp,rp;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        nd = 0;
        for(div=n;div>0;div/=10)
            nd++;
        System.out.println("Result is  : ");
        div = (int)Math.pow(10,nd-1);
        for(i=1;i<nd;i++){
            lp = n/div;
            rp = n%div;
            n = rp*10 + lp;
            System.out.print(n+" ");
        }
    }
}
