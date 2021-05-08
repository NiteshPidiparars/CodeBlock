import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
public class Client
{
    public static void main(String[]args)throws Exception
    {
        Notifier notifier = (Notifier)Naming.lookup("rmi://DESKTOP-N9QLGBV/Notifier");
        ScoreNotifier sn = new ScoreNotifier();
        sn.run();
        //ReceiverPluse rv = new ReceiverPluse();
        //notifier.registerMe(rv);
    }
}
