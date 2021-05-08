import java.rmi.*;
import java.rmi.registry.*;
public class CalculatorClient
{
    public static void main(String[]args)throws Exception
    {
        String name = "Calculator";
        Registry registry = LocateRegistry.getRegistry("DESKTOP-N9QLGBV");
        System.out.println(registry);
        //Uncomment above line if you want to display the info, about registry
        Calculator cal = (Calculator)registry.lookup(name);
        System.out.println(cal);
        //Uncomment above line if you want to display the info, about cal
        int x=4, y=5;
        int result = cal.add(x, y);
        System.out.println("Sent : "+x+" add "+y);
        System.out.println("Received("+x+"+"+y+"=):"+result);
    }
}
