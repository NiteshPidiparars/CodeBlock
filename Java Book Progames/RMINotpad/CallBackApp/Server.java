import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
public class Server
{
    public static void main(String[]args)throws Exception
    {
        ScoreNotifier notifier = new ScoreNotifier();
        Notifier stub = (Notifier)UnicastRemoteObject.exportObject(notifier, 0);
        Registry registry = LocateRegistry.createRegistry(1099);
        String name = "Notifier";
        registry.rebind(name, stub);
        System.out.println("ScoreNotifier Bounded.........");
    }
}
