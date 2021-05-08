import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class Server
{
    public static void main(String[]args)
    {
        /*if(System.getSecurityManager() == null){
            System.setSecurityManager(new SecurityManager());
        }*/
        try{
            SchedulerImpl scheduler = new SchedulerImpl();
            Scheduler stub = (Scheduler)UnicastRemoteObject.exportObject(scheduler, 0);
            Registry registry = LocateRegistry.createRegistry(1099);
            //Registry registry = LocateRegistry.getRegistry();
            String name = "Scheduler";
            registry.rebind(name, stub);
            System.out.println("Scheduler Bounded.........");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
