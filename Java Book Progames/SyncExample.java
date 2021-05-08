class CallThread
{
    void Call(String msg)
    {
        System.out.print("["+msg);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Interrupt");
        }
        System.out.println("]");
    }
}
class Caller implements Runnable
{
    String msg;
    CallThread target;
    Thread t;
    public Caller(CallThread targ,String s)
    {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    public void run()
    {
        synchronized(target){
            target.Call(msg);
        }
    }
}
public class SyncExample
{
    public static void main(String[]args)
    {
        CallThread target = new CallThread();
        Caller obj1 = new Caller(target,"Thread A");
        Caller obj2 = new Caller(target,"Synchronized");
        Caller obj3 = new Caller(target,"Thread B");
        try{
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
