import javax.jms.*;
public class Copier implements MessageListener{
    Session sn;
    MessageProducer mp;
    public Copier(String args[]){
        try{
            ConnectionFactory cf =  new com.sun.messaging.ConnectionFactory();
            ((com.sun.messaging.ConnectionFactory)cf).setProperty(com.sun.messaging.ConnectionConfiguration.imqAddressList, "192.168.43.161:7676");
            Connection con = cf.createConnection();
            sn = con.createSession(true, Session.AUTO_ACKNOWLEDGE);
            Destination from = sn.createQueue("customerQueue");
            MessageConsumer mc = sn.createConsumer(from);
            Destination to = sn.createQueue("customerQueue");
            mp = sn.createProducer(to);
            con.start();
            mc.setMessageListener(this);
        }catch(Exception e){
            System.out.println("Exception  : "+e.getMessage());
        }
    }
    public static void main(String[]args){
        new Copier(args);
    }
    @Override
    public void onMessage(Message msg) {
        try{
            mp.send(msg);
            sn.commit();
        }catch(Exception e){
            try{
                sn.rollback();
            }catch(Exception e1){
                e1.printStackTrace();
            }
        }
    }
}
