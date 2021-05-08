class MyThread extends Thread
{
    int count = 0;
    public int getCount(){return count;}
    public void run()
    {
        while(true){
            count++;
        }
    }
}
public class PriorityTest
{
    public static void main(String[]args)throws InterruptedException
    {
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();
        m1.setPriority(Thread.MAX_PRIORITY);
        m2.setPriority(Thread.MIN_PRIORITY);
        m1.start();
        m2.start();
        Thread.sleep(100);
        System.out.println("Thread m1 Count : "+m1.getCount());
        System.out.println("Thread m2 Count : "+m2.getCount());
    }
}
