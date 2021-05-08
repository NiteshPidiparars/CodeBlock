import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
public class CalculatorServerJNDI {
    public static void main(String[]args) throws RemoteException, NamingException{
        Hashtable env = new Hashtable();
        env.put("java.naming.factory.initial","com.sun.jndi.rmi.registry.RegistryContextFactory");
        env.put("java.naming.provider.url", "rmi://192.168.43.161:6768");
        try{
            SimpleCalculator calc = new SimpleCalculator();
            //Calculator stub = (Calculator) UnicastRemoteObject.exportObject(calc, 0);
            //Registry registry = LocateRegistry.createRegistry(6768);
            Context ctx = new InitialContext(env);
            ctx.rebind("name", calc);
            System.out.println("Calculator Server Ready............");
        }catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
