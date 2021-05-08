import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class SendEmail4 {
    public static void main(String[]args) throws MessagingException{
        String host = "smtp.gmail.com";
        String from = "niteshpidiparas76@gmail.com", to = from;
        final String username = "niteshpidiparas76@gmail.com";
        final String password = "Nitesh98";
        Properties p = new Properties();
        p.setProperty("mail.smtp.host", host);
        p.setProperty("mail.smtp.port", "587");
        p.setProperty("mail.smtp.starttls.enable", "true");
        p.setProperty("mail.smtp.auth", "true");
        Session s = Session.getDefaultInstance(p, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(username, password);
            }
        });
        MimeMessage msg = new MimeMessage(s);
        msg.setFrom(new InternetAddress(from));
        msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
        msg.setSubject("Mail With Html Body");
        msg.setText("Text Message");
        msg.setContent("<h2>Mail With Html Body</h2>","text/html");
        Transport.send(msg);
        System.out.println("msg sent..........");
    }
}
