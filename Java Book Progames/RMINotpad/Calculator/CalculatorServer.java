import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
public class CalculatorServer
{
    public static void main(String[]args)throws Exception
    {
        SimpleCalculator cal = new SimpleCalculator();
        Calculator stub = (Calculator)UnicastRemoteObject.exportObject(cal,0);
        Registry registry = LocateRegistry.getRegistry();
        String name = "Calculator";
        registry.bind(name, stub);
        System.out.println("Calculator Service Ready.......");
    }
}
