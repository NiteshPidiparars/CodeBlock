import java.rmi.*;
import java.rmi.registry.*;
public class CalculatorClient
{
    public static void main(String[]args)throws Exception
    {
        try
        {
            String name = "calculator";
            Calculator cal = (Calculator)SimpleRegistry.lookup("DESKTOP-N9QLGBV",6789,name);
            int x=4, y=5;
            int result = cal.add(x,y);
            System.out.println("Sent : "+x+" add "+y);
            System.out.println("Received("+x+"+"+y+"=):"+result);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
