import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Client {
    public Client(){}
    public static void main(String[]ags){
        if(System.getSecurityManager() == null){
            System.setSecurityManager(new SecurityManager());
        }
        try{
            //Getting the registry
            Registry registry = LocateRegistry.getRegistry("DESKTOP-N9QLGBV");
            //Looking up the registry for the remote object
            Hello stub = (Hello) registry.lookup("Hello");
            //Calling the remote method using the obtained object
            stub.animation();
            System.out.println("Remote method Invoked");
        }catch(Exception e){
            System.out.println("Client Exception : "+e.toString());
        }
    }
}
