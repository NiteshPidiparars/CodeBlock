import java.rmi.*;
import java.rmi.server.*;
public class SimpleReceiver extends UnicastRemoteObject implements Receiver, java.io.Serializable
{
    public SimpleReceiver()throws RemoteException{
        super();
    }
    public void notify(String msg)
    {
        try{
            System.out.println("Received : "+msg);
        }catch(Exception e){e.printStackTrace();}
    }
}
