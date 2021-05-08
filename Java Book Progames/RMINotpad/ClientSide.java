import java.rmi.*;
public class ClientSide
{
    public static void main(String[]args)throws Exception{
        FactInterface fi;
        fi = (FactInterface)Naming.lookup("tag");
        int i = fi.fact(6);
        System.out.println("Factorial of "+i+" is : "+i);
    }
}
