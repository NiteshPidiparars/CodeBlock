import java.util.*;
import javax.mail.*;
public class RetrieveEmail
{
    public static void main(String []args)throws Exception
    {
        String host = "pop.gmail.com", protocol = "pop3s";
        String username = "niteshpidiparas76@gmail.com";
        String password = "Nitesh98";
        Properties p = new Properties();
        Session s = Session.getInstance(p);
        s.setDebug(true);
        Store store = s.getStore(protocol);
        store.connect(host, username, password);
        Folder inbox = store.getFolder("Inbox");
        if(inbox.exists()){
            inbox.open(Folder.READ_ONLY);
            Message[] emails = inbox.getMessages();
            for(int i=0;i<emails.length;i++){
                System.out.println("Message : "+(i+1));
                emails[i].writeTo(System.out);
            }
            inbox.close(false);
        }else
            System.out.println("Inbox Not Found");
            store.close();
    }
}
