class A
{
    int i=50;
    public A(int i)
    {
        this.i=i;
    }
    protected void finalize()throws Throwable
    {
        System.out.println("Finalize method 10 is done");
    }
}
public class Bye
{
    public static void main(String[]args)
    {
        A a1=new A(10);
        A a2=new A(20);
        a1=a2;
        for(int i=0;i<=10;i++)
            System.out.println("i= "+i);
        System.gc();
        System.out.println("done");
    }
}

