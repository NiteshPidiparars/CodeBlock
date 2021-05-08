import java.util.Properties;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;
public class CopyEmail {
    public static void main(String[]args) throws NoSuchProviderException, MessagingException{
        String host = "pop.gmail.com";
        String username = "niteshpidiparas67@gmail.com";
        String password = "nitesh@19";
        Properties p = new Properties();
        Session s = Session.getInstance(p);
        s.setDebug(true);
        Store store = s.getStore("imaps");
        store.connect(host, username, password);
        Folder inbox = store.getFolder("Inbox");
        Folder defaultFolder = store.getDefaultFolder();
        Folder backup = defaultFolder.getFolder("backup");
        boolean isCreate = backup.create(Folder.HOLDS_FOLDERS);
        System.out.println("Created : "+isCreate);
        inbox.open(Folder.READ_ONLY);
        Message[] emails = inbox.getMessages();
        inbox.copyMessages(emails, backup);
    }
}
