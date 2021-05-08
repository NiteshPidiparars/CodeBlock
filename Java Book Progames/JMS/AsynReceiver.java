import javax.jms.*;
public class AsynReceiver {
   public static void main(String[]args){
        try{
            ConnectionFactory cf = new com.sun.messaging.ConnectionFactory();
            ((com.sun.messaging.ConnectionFactory)cf).setProperty(com.sun.messaging.ConnectionConfiguration.imqAddressList, "192.168.43.161:7676");
            Connection con = cf.createConnection();
            Session sn = con.createSession(false, Session.AUTO_ACKNOWLEDGE);
            Destination dst = sn.createQueue("customerQueue");
            MessageConsumer mc = sn.createConsumer(dst);
            con.start();
            mc.setMessageListener(new AListener());
            System.out.println("Continuing its own work");
        }catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }

    private static class AListener implements MessageListener {
        @Override
        public void onMessage(Message msg) {
            TextMessage tm = (TextMessage) msg;
            try{
                System.out.println("Received : "+tm.getText());
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
