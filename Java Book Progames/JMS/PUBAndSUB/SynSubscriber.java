import javax.jms.*;
public class SynSubscriber {
    public static void main(String[]args){
        try{
            ConnectionFactory cf = new com.sun.messaging.ConnectionFactory();
            ((com.sun.messaging.ConnectionFactory)cf).setProperty(com.sun.messaging.ConnectionConfiguration.imqAddressList, "192.168.43.161:7676");
            Connection con = cf.createConnection();
            Session sn = con.createSession(false, Session.AUTO_ACKNOWLEDGE);
            Destination dst = sn.createTopic("ATopic");
            MessageConsumer mc = sn.createConsumer(dst);
            con.start();
            TextMessage tm = (TextMessage) mc.receive();
            System.out.println("Received Message : "+tm.getText());
            sn.close();
            con.close();
        }catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
