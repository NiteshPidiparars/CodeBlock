public class TwoThreadExample
{
    public static void main(String[]args)
    {
        new SimpleThread("Thread A").start();
        new SimpleThread("Thread B").start();
    }
}
class SimpleThread extends Thread
{
    public SimpleThread(String msg)
    {
        super(msg);
    }
    public void run()
    {
        for(int i=0; i<5; i++){
            System.out.println(i+" "+getName());
            try
            {
                sleep((int)(Math.random()*1000));
            }catch(Exception e){}
        }
        System.out.println("Exit!"+getName());
    }
}
