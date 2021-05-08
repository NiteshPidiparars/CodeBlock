class A
{
    int i;
    public A(int i)
    {
        this.i=i;
    }
    protected void finalize()throws Throwable
    {
        System.out.println("Finalize method");
    }
}
public class Value
{
    public static void main(String[]args)
    {
        A a1=new A(10);
        A a2=new A(20);
        a1=a2;
        Runtime.getRuntime().runFinalization();
        System.out.println("done");
    }
}
