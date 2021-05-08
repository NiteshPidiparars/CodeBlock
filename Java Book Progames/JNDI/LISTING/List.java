import java.util.Enumeration;
import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
public class List {
    public static void main(String[]args){
        Hashtable env = new Hashtable();
        env.put("java.naming.factory.initial","com.sun.jndi.rmi.registry.RegistryContextFactory");
        env.put("java.naming.provider.url", "rmi://172.16.5.81:6789");
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");
        env.put(Context.PROVIDER_URL, "file:/D:/List");
        try{
            Context ctx = new InitialContext(env);
            Enumeration e = ctx.list("C:/Users/hp/Desktop/MY/Java Book Progames/JNDI/LISTING");
            while(e.hasMoreElements()){
                NameClassPair ncp = (NameClassPair) e.nextElement();
                System.out.println(ncp.getName()+" <-> "+ncp.getClassName());
            }
        }catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
