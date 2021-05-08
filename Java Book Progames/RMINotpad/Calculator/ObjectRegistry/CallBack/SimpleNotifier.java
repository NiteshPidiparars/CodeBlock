import java.rmi.*;
public class SimpleNotifier implements Notifier
{
    public void registerMe(Receiver r)
    {
        try
        {
            System.out.println("Registered the Receiver : "+r);
            String msg = "A Message from SimpleNotifier";
            r.notify(msg);//CallBack
            System.out.println("Sent : "+msg);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
