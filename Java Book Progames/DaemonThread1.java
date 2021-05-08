public class DaemonThread1 extends Thread
{
    public void run()
    {
        System.out.println("Thread Name : "+Thread.currentThread().getName());
        System.out.println("Check if its DaemonThread : "+Thread.currentThread().isDaemon());
    }
    public static void main(String[]args)
    {
        DaemonThread1 t1 = new DaemonThread1();
        DaemonThread1 t2 = new DaemonThread1();
        t1.start();
        //Exception as the Thread is already started
        t1.setDaemon(true);
        t2.start();
    }
}
