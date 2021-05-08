class Timer extends Thread
{
    public void run()
    {
        while(true){
            System.out.println("Timer running. Date & Time : "+new java.util.Date());
            if(Thread.interrupted()){
                System.out.println("Timer was Interrupted");
                return;
            }
        }
    }
}
public class InterruptedDemo1
{
    public static void main(String[]args)throws InterruptedException
    {
        Timer t = new Timer();
        t.start();
        Thread.sleep(4000);
        t.interrupt();
    }
}
