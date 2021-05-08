class CurrentThread
{
    public static void main(String[]args)
    {
        int i;
        Thread t;
        Thread currentThread=Thread.currentThread();
        for(i=0;i<=10;i++)
        {
            System.out.println(currentThread);
            System.out.println("i = "+i);
        }
        try
        {
            t.sleep(1000);
        }catch(InterruptedException e)
        {
            System.out.println("Exception are occur: "+e.getMessage());
        }

    };
};
