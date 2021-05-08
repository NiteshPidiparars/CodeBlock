import java.lang.Thread;
public class TDemo implements Runnable
{
    TDemo()
    {
        Thread currThread=Thread.currentThread();
        Thread t=new Thread(this,"Admin Thread");
        System.out.println("create Thread = "+currThread);
        System.out.println("this Thread= "+t);
        t.start();
    }
    public void run(){
    System.out.println("this is run() method");
    }
    public static void main(String[]args)
    {
        new TDemo();
    }
}
