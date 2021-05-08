import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.InitialContext;
public class CalculatorClientJNDI {
    public static void main(String[]args){
        Hashtable env = new Hashtable();
        env.put("java.naming.factory.initial","com.sun.jndi.rmi.registry.RegistryContextFactory");
        env.put("java.naming.provider.url", "rmi://192.168.43.161:6768");
        try{
            Context ctx = new InitialContext(env);
            Calculator cal = (Calculator) ctx.lookup("name");
            int x=4, y=4;
            System.out.println("Sent : "+x+" and "+y);
            int result = cal.add(x, y);
            System.out.println("Received : "+result);
        }catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
