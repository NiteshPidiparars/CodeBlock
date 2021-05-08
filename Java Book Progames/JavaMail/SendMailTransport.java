import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
public class SendMailTransport
{
    public static void main(String[]args)
    {
        String host = "smtp.gmail.com";
        String from = "niteshpidiparas76@gmail.com", to = from;
        String username = "niteshpidiparas76@gmail.com";
        String password = "Nitesh98";
        Properties p = new Properties();
        Session s = Session.getInstance(p);
        try{
            MimeMessage msg = new MimeMessage(s);
            msg.setFrom(new InternetAddress(from));
            msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            msg.setSubject("A Text Message via Transport");
            msg.setText("Text Message for SSL throw Transport");

            Transport t = s.getTransport("smtps");
            t.connect(host, username, password);
            t.sendMessage(msg, msg.getAllRecipients());
            t.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
