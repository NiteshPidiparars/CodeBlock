public class MyClass implements Runnable
{
    public void run()
    {
        System.out.println("You are in Thread");
        for(int i=0;i<4;i++){
            System.out.println("In Thread : "+i);
        }
    }
    public static void main(String[]args)
    {
        System.out.println("You are in Main Thread");
        Thread t = new Thread(new MyClass());
        t.start();
        for(int i=0;i<6;i++){
            System.out.println("In Main Thread : "+i);
        }
    }
}
