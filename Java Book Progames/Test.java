public class Test
{
    public static void main(String[]args)
    {
        Test t1 = new Test();
        Test t2 = new Test();
        t1 = null;
        System.gc();
        t2 = null;
        Runtime.getRuntime().gc();
    }
    protected void finalize()throws Throwable
    {
        System.out.println("Garbage Collector Called");
        System.out.println("Object garbage Collected : "+this);
    }
}
