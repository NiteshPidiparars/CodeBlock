public class ThreadDemo implements Runnable
{
    Thread t;
    ThreadDemo()
    {
        t = new Thread(this,"Admin Thread");
        t.setPriority(1);
        System.out.println("Thread : "+t);
        t.start();
    }
    public void run()
    {
        System.out.println("Thread Priority : "+t.getPriority());
    }
    public static void main(String[]args)
    {
        new ThreadDemo();
    }
}
