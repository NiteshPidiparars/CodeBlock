import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Client
{
    public static void main(String[]args)
    {
        /*if(System.getSecurityMenager() == null){
            System.setSecurityManager(new SecurityManager());
        }*/
        try{
            Registry registry = LocateRegistry.getRegistry("DESKTOP-N9QLGBV");
            String name = "Scheduler";
            Scheduler scheduler = (Scheduler)registry.lookup(name);
            Factorial aJob = new Factorial(Integer.parseInt("8"));
            Result r = scheduler.run(aJob);
            System.out.println(8 +"! = "+r.output());
            System.out.println("Execution Time : "+r.completionTime()+" micro sec(s)");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

