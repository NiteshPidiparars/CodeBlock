public class ThreadInfo
{
    public static void main(String[]args)
    {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread : "+t);
        System.out.println("Name : "+t.getName());
        System.out.println("Id : "+t.getId());
        System.out.println("Priority : "+t.getPriority());
        System.out.println("State : "+t.getState());

        System.out.println("Changing Name and Priority.....\n");
        t.setName("Primary");
        t.setPriority(8);
        System.out.println("After Name and Priority change....");
        System.out.println("Current Thread : "+t);
        System.out.println("Name : "+t.getName());
        System.out.println("Priority : "+t.getPriority());
    }
}
