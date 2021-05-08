import java.rmi.RemoteException;
import javax.rmi.PortableRemoteObject;
public class SimpleCalculator extends PortableRemoteObject implements Calculator{
    public SimpleCalculator()throws RemoteException{};
    @Override
    public int add(int a, int b) throws RemoteException {
        System.out.println("Received : "+a+" and "+b);
        int result = a + b;
        System.out.println("Sent : "+result);
        return result;
    }

}
