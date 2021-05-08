import java.rmi.*;
import java.util.*;
public class ScoreNotifier implements Notifier, Runnable
{
    Hashtable receivers = new Hashtable();
    public ScoreNotifier()
    {
        new Thread(this).start();
    }
    public void registerMe(Receiver r)
    {
        try
        {
            receivers.put(String.valueOf(receivers.size()),r);
            System.out.println("Registered a Receiver");
            System.out.println("Number of Registered Receivers : "+receivers.size());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void run()
    {
        Random rand = new Random();
        int score = 0, run;
        while(true){
            do{
                try{
                    Thread.sleep(1000+rand.nextInt(1000));
                }catch(Exception e){
                    e.printStackTrace();
                }
            }while((run = rand.nextInt(7)) == 0);
            score += run;
            int no = receivers.size();
            for(int i=0;i<no;i++){
                Receiver r = (Receiver)receivers.get(String.valueOf(i));
                System.out.println("Sending : "+score);
                new Sender(r, score).start();
            }
        }
    }
    private class Sender extends Thread
    {
        Receiver receiver;
        int score;
        public Sender(Receiver r, int s)
        {
            this.receiver = r;
            this.score = s;
        }
        public void run()
        {
            try{
                receiver.notify(String.valueOf(score));
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
