import java.rmi.*;
public class CallBackClient
{
    public static void main(String[]args)
    {
        try
        {
            String url = "rmi://"+"DESKTOP-N9QLGBV"+"/notifier";
            Notifier notifier = (Notifier)Naming.lookup(url);
            SimpleReceiver recv = new SimpleReceiver();
            notifier.registerMe(recv);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
