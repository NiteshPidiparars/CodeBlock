import java.rmi.RemoteException;
import javax.rmi.PortableRemoteObject;
public class SimpleCalculator extends PortableRemoteObject implements Calculator{

    public SimpleCalculator()throws RemoteException{}
    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
    public String[] _ids(){
        String[] id = {"IDL:CalculatorApp/Calculator:1.0"};
        return id;
    }

}
