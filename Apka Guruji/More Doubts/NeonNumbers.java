/* WAP in Java to print all the neon numbers
   between 1 to 1000 */
import java.util.*;
public class NeonNumbers
{
    public static void main(String[]args)
    {
        int n,sq,s,div;
        System.out.println("Such Numbers are : ");
        for(n=1;n<=1000;n++){
            sq = n*n;
            s = 0;
            for(div=sq;div>0;div/=10){
                s += div%10;
            }
            if(s==n)
                System.out.print(n+" ");
        }
    }
}
