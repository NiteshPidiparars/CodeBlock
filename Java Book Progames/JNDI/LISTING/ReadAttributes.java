import java.util.Hashtable;
import javax.naming.NamingEnumeration;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
public class ReadAttributes {
    public static void main(String[]args){
        Hashtable env = new Hashtable();
        env.put("java.naming.factory.initial", "com.sun.jndi.rmi.registry.RegistryContextFactory");
        env.put("java.naming.provider.url", "rmi://192.168.43.161:6798");
        try{
            DirContext ctx = new InitialDirContext(env);
            Attributes attrs = ctx.getAttributes("D:/List");
            for(NamingEnumeration ne = attrs.getAll(); ne.hasMore();){
                Attribute attr = (Attribute) ne.next();
                System.out.println("Attribute : "+attr.getID());
                for(NamingEnumeration e = attr.getAll(); e.hasMore();)
                    System.out.println("Value : "+e.next());
            }
        }catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
