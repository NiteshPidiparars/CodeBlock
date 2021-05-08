class A extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
            System.out.println("i = "+i+" Thread");
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
            System.out.println("i = "+i+" Thread");
    }
}
public class Example1
{
    public static void main(String[]args)
    {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}
