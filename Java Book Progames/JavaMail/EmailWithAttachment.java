import java.io.*;
import javax.mail.*;
import java.util.*;
import javax.mail.internet.*;
public class EmailWithAttachment
{
    public static void main(String[]args)
    {
        String host = "smtp.gmail.com";
        String from = "niteshpidiparas76@gmail.com", to = from;
        final String username = "niteshpidiparas76@gmail.com";
        final String password = "Nitesh98";
        Properties p = new Properties();
        p.setProperty("mail.smtp.host",host);
        p.setProperty("mail.smtp.port","587");
        p.setProperty("mail.smtp.starttls.enable","true");
        p.setProperty("mail.smtp.auth","true");
        Session s = Session.getDefaultInstance(p, new Authenticator()
        {
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(username, password);
            }
        });
        try{
            MimeMessage msg = new MimeMessage(s);
            msg.setFrom(new InternetAddress(from));
            msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            msg.setSubject("Mail With Attachment");
            Multipart mutipart = new MimeMultipart();
            MimeBodyPart part1 = new MimeBodyPart();
            MimeBodyPart part2 = new MimeBodyPart();
            part1.setText("Text Mail has an Attachment");
            String filename = "EmailWithAttachment.java";
            part2.attachFile(filename);
            mutipart.addBodyPart(part1);
            mutipart.addBodyPart(part2);
            msg.setContent(mutipart);
            Transport.send(msg);
            System.out.println("Send Message.......");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
