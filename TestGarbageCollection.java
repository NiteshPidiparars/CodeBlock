public class TestGarbageCollection extends TestClass
{
    public class TestClass{
     public TestClass()
    {
        System.out.println("Constructor");
    }
    public void display()
    {
        System.out.println("display");
    }
    public void finalize()
    {
        System.out.println("Destructor");
    }
}
    public static void main(String[]args)
    {
        while(true)
        {
            TestClass tc=new TestClass();
            tc.display();
            System.gc();
        }
    }
}
