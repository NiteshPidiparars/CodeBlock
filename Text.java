class A
{
    int i=50;
    public A(int i)
    {
        this .i=i;
    }
    protected void finalize()throws Throwable
    {
        System.out.println("from finalize method");
    }
}
    public class Text
    {
        public static void main(String[]args)
        {
            A a1=new A(10);
            A a2=new A(20);
         try{
                 a1.finalize();
            }
            catch(Throwable e)
            {
                e.printStackTrace();
                a1=a2;
            }
             a1=a2;
            Runtime.getRuntime().gc();
            System.out.println("done");
    }
}
