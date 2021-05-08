import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
public class CallBackServer
{
    public static void main(String[]args)
    {
        try
        {
            String name = "notifier";
            SimpleNotifier nfier = new SimpleNotifier();
            Notifier stub = (Notifier)UnicastRemoteObject.exportObject(nfier, 0);
            Registry registry = LocateRegistry.createRegistry(8080);
            registry.rebind(name, stub);
            System.out.println("Notifier Ready.......");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
