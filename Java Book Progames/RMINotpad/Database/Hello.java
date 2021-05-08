import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
public interface Hello extends Remote{
    public List<Student> getStudent()throws RemoteException;
}
