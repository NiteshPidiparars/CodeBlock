import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Notifier extends Remote
{
    public void registerMe(Receiver r)throws RemoteException;
}
