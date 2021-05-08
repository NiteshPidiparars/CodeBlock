import java.awt.BorderLayout;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class Server extends ImplExample {

    public Server() {
    }

    public static void main(String[] args) throws RemoteException {
        try {
            ImplExample obj = new ImplExample();
            Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);
            Registry registry = LocateRegistry.createRegistry(8080);
            registry.rebind("Hello", obj);
            System.out.println("Server Ready.......");
        } catch (Exception e) {
            System.out.println("Server Exception : "+e.toString());
        }
    }
}
