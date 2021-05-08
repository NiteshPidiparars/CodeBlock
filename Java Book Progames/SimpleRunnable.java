public class SimpleRunnable implements Runnable
{
    public void run()
    {
        System.out.println("Hello from a Thread");
    }
    public static void main(String[]args)
    {
        (new Thread(new SimpleRunnable())).start();
    }
}
