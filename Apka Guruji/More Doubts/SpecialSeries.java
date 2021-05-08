/* Calculate Using Function :
   (1/2)+(3/4)+(5/6)+.......(19/20) */
import java.util.*;
public class SpecialSeries
{
    double seriessum()
    {
        double i,s=0;
        for(i=1;i<=19;i+=2)
            s += i/(i+1);
        return s;
    }
    public static void main(String[]args)
    {
        double s;
        SpecialSeries ob = new SpecialSeries();
        s = ob.seriessum();
        System.out.println("Sum is : "+s);
    }
}

