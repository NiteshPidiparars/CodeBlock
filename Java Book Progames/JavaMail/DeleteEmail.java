import java.util.Properties;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
public class DeleteEmail {
    public static void main(String[]args) throws NoSuchProviderException, MessagingException{
        String host = "pop.gmail.com", protocol = "imaps";
        String username = "niteshpidiparas67@gmail.com";
        String password = "nitesh@19";
        Properties p = new Properties();
        Session s = Session.getInstance(p);
        //s.setDebug(true);
        Store store = s.getStore(protocol);
        store.connect(host, username, password);
        Folder inbox = store.getFolder("Inbox");
        //inbox.expunge();
        if(inbox.exists()){
            inbox.open(Folder.READ_WRITE);
            Message[] emails = inbox.getMessages();
            for(int i=0;i<emails.length;i++){
                System.out.println("Deleted Message : "+(i+1));
                emails[i].setFlag(Flags.Flag.DELETED, true);
            }
            inbox.close(false);
        }else
            System.out.println("Inbox not founded");
        store.close();
    }
}
