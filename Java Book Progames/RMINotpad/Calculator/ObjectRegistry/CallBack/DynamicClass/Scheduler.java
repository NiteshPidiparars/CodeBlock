import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Scheduler extends Remote
{
    Result run(Job aJob)throws RemoteException;
}
