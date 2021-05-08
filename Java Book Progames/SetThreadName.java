public class SetThreadName
{
    public static void main(String[]args)
    {
        Thread t = Thread.currentThread();
        System.out.println(t);
        t.setName("Set Thread Name Example");
        System.out.println("Thread : "+t.getName());
    }
}
