class MyThread extends Thread
{
    boolean active = true;
    public void Suspend(){active = false;}
    public synchronized void run()
    {
        active = true;
        notify();
    }
    public synchronized void Resume()
    {
        try{
            while(true){
                if(active)
                {
                    System.out.println("Running....");
                    Thread.sleep(500);
                }
                else
                {
                    System.out.println("Suspend....");
                    wait();
                }
            }
        }catch(Exception e){e.printStackTrace();}
    }
}
public class SuspendResume
{
    public static void main(String[]args)throws Exception
    {
        MyThread t = new MyThread();
        t.start();
        while(true){
            Thread.sleep(1000);
            t.Suspend();
            Thread.sleep(1000);
            t.Resume();
        }
    }
}
