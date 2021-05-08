import java.util.Enumeration;
import java.util.Hashtable;
import javax.naming.Binding;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
public class ListBindings {
    public static void main(String[]args){
        Hashtable env = new Hashtable();
        env.put("java.naming.factory.initial","com.sun.jndi.rmi.registry.RegistryContextFactory");
        env.put("java.naming.provider.url", "rmi://192.168.43.161:6798");
        try{
            Context ctx = new InitialContext(env);
            Enumeration e = ctx.listBindings("C:/Users/hp/Desktop/MY/API/smtp-1.6.0.jar");
            while(e.hasMoreElements()){
                Binding ncp = (Binding) e.nextElement();
                System.out.println(ncp.getName()+" <-> "+ncp.getClassName());
            }
        }catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
