import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class Server extends FxSample{
    public Server(){}
    public static void main(String[]args){/*
        if(System.getSecurityManager() == null){
            System.setSecurityManager(new SecurityManager());
        }*/
        try{
            //Instantiating the implementation class
            FxSample sample = new FxSample();
            //Exporting the object of implementation class
            //(here we are exporting the remote object to the stub)
            Hello stub = (Hello)UnicastRemoteObject.exportObject(sample, 0);
            //Binding the remote Object(stub) in the registry
            Registry registry = LocateRegistry.createRegistry(8080);
            registry.rebind("Hello", stub);
            System.out.println("Server Ready.........");
        }catch(Exception e){
            System.out.println("Server Exception : "+e.toString());
        }
    }
}
