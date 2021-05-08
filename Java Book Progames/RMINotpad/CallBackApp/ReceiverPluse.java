import java.rmi.RemoteException;
public class ReceiverPluse implements Receiver, java.io.Serializable
{
    public void notify(String s)
    {
        System.out.println("Received Me : "+s);
    }
}
