import java.rmi.Naming;
import java.rmi.*;
import java.rmi.registry.*;
public class MainRMI
{
    public static void main(String[]args)throws Exception
    {
        FactImpl impl = new FactImpl();
        //Generating Skeleton
        Naming.rebind("tag",impl);
        System.out.println("Bounded.....");
    }
}
