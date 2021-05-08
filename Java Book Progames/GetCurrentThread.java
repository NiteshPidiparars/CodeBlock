public class GetCurrentThread
{
    public static void main(String[]args)
    {
        Thread t = Thread.currentThread();
        t.setName("MainThread");
        System.out.println("Id of Current Thread : "+t.getId());
        System.out.println("Name of Current Thread : "+t.getName());
        System.out.println("Priority of Current Thread : "+t.getPriority());
    }
}
