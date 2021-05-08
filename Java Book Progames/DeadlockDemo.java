class MyThread extends Thread
{
    String r1,r2;
    int id;
    MyThread(int i,String s1,String s2)
    {
        id = i;
        r1 = s1;
        r2 = s2;
        start();
    }
    public void run()
    {
        synchronized(MyThread.class){
            synchronized(r1)
            {
                System.out.println("Thread "+id+" Obtained lock on "+r1);
                try
                {
                    Thread.sleep(1000);
                }
                catch(Exception e) {}
                System.out.println("Thread "+id+" is waiting to Obtain lock on " +r2);
            }
            synchronized(r2)
            {
                System.out.println("Thread "+id+" Obtained lock on "+r2);
            }
        }
    }
}
public class DeadlockDemo
{
    public static void main(String[]args)throws Exception
    {
        //int a[] = {2,6,4,0,1,5,3};
        String r1 = new String("R1");
        String r2 = new String("R2");
        MyThread t1 = new MyThread(1,r1,r2);
        MyThread t2 = new MyThread(2,r2,r1);
    }
}
