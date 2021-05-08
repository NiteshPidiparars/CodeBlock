import javax.jms.*;
public class Publisher {
    public static void main(String[]args){
        try{
            ConnectionFactory cf = new com.sun.messaging.ConnectionFactory();
            ((com.sun.messaging.ConnectionFactory)cf).setProperty(com.sun.messaging.ConnectionConfiguration.imqAddressList, "192.168.43.161:7676");
            Connection con = cf.createConnection();
            Session sn = con.createSession(false, Session.AUTO_ACKNOWLEDGE);
            Destination dst = sn.createTopic("ATopic");
            MessageProducer mp = sn.createProducer(dst);
            TextMessage tm = sn.createTextMessage();
            tm.setText("A Text Message");
            mp.send(tm);
            System.out.println("Message Send Successfully........");
            sn.close();
            con.close();
        }catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
