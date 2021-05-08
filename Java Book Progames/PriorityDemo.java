class PriorityDemo extends Thread
{
    public void run()
    {
        System.out.println("Child's Priority : "+getPriority());
        setPriority(3);
        System.out.println("After Change, Child's Priority : "+getPriority());
    }
    public static void main(String[]args)
    {
        Thread t = Thread.currentThread();
        System.out.println("Main's Priority : "+t.getPriority());
        t.setPriority(7);
        System.out.println("After change, Main's Priority : "+t.getPriority());
        new PriorityDemo().start();
    }
}
