/* Calculate Using Function :
   (1/10)+(1/20)+(1/30)+.......(1/110) */
import java.util.*;
public class InterestingSeries
{
    double sumseries()
    {
        double i,s=0,den;
        for(den=10;den<=110;den+=10){
            s += 1/den;
        }
        return s;
    }
    public static void main(String[]args)
    {
        double s;
        InterestingSeries in = new InterestingSeries();
        s = in.sumseries();
        System.out.println("Sum is  : "+s);
    }
}

