import java.util.*;
public class KaprekarNumber
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n,sq,lp,rp,nd,i;
        String s;
        boolean pairFound=false;
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        sq=n*n;
        s="0"+sq;
        nd=s.length();
        for(i=1;i<nd;i++)
        {
            lp=Integer.parseInt(s.substring(0,i));
            rp=Integer.parseInt(s.substring(i));
            if(rp==0)
            {
                break;
            }
            if(n==(lp+rp))
            {
                System.out.println("Pair Found: "+lp+","+rp);
                pairFound=true;
                break;
            }
        }
        if(pairFound)
        System.out.println("its an Kapreker Number");
        else
        System.out.println("its not an Kapreker Number");
    }
}
