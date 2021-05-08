import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class SendEmail {
    public static void main(String[] args) {
        // TODO code application logic here
        String host = "smtp.gmail.com";
        String userName = "niteshpidiparas76@gmail.com";
        String password = "Nitesh98";
        String from = "niteshpidiparas76@gmail.com" , to = from;
        Properties properties = new Properties();
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.smtp.port", "587");
        properties.setProperty("mail.smtp.starttls.enable", "true");
        properties.setProperty("mail.smtp.auth", "true");
        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(userName, password);
            }
        });
        try{
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(from));
            msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            msg.setSubject("A Text Mail");
            msg.setText("Sent a mail without authentication");
            Transport.send(msg);
            System.out.println("Message Sent Successfully.......");
        }catch(Exception e){
            e.printStackTrace();
        }

    }

}
