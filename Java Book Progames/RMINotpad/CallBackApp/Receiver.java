import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Receiver extends Remote
{
    public void notify(String n)throws RemoteException;
}
