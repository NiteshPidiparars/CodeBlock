import java.rmi.server.UnicastRemoteObject;
import java.rmi.*;
class FactImpl extends UnicastRemoteObject implements FactInterface
{
    public FactImpl()throws RemoteException
    {
        super();
    }
    public int fact(int a)
    {
        int i, fact=1;
        for(i=1;i<=a;i++){
            fact *= i;
        }
        return fact;
    }
}
