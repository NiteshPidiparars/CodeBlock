import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.transaction.TransactionRequiredException;
public class SendEmail1 {
    public static void main(String[]args){
        String host = "smtp.gmail.com";
        final String username = "niteshpidiparas76@gmail.com";
        final String password = "Nitesh98";
        String from = "niteshpidiparas76@gmail.com", to = from;
        Properties p = new Properties();
        p.setProperty("mail.smtp.host", host);
        p.setProperty("mail.smtp.socketFactory", "javax.net.ssl.SSLSocketFactory");
        p.setProperty("mail.smtp.starttls.enable", "true");
        p.setProperty("mail.smtp.auth","true");
        //disable to line above and enable one line below to use TLS
        //p.setProperty("mail.smtp.starttls.enable", "true");
        Session s = Session.getDefaultInstance(p, new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(username, password);
                }
        });
        s.setDebug(true);
        try{
            MimeMessage msg = new MimeMessage(s);
            msg.setFrom(new InternetAddress(from));
            msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            msg.setSubject("A Text Mail");
            msg.setText("Text Message");
            Transport.send(msg);
            System.out.println("Message Send Successfully.......");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
