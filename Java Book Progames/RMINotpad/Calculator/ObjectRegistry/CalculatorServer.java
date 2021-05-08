import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
public class CalculatorServer
{
    public static void main(String[]args)throws Exception
    {
        try
        {
            SimpleCalculator cal = new SimpleCalculator();
            Calculator stub = (Calculator)UnicastRemoteObject.exportObject(cal,0);
            String name = "calculator";
            SimpleRegistry registry = new SimpleRegistry();
            registry.rebind(stub, name);
            System.out.println("Calculator Service Ready.......");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
