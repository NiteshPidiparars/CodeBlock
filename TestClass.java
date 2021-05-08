interface in1
{
    final int a=10;
    default void display()
    {
        System.out.println("Hello");
    }
}
class TestClass implements in1
{
    public static void main(String[]args)
    {
        TestClass t1=new TestClass();
        t1.display();
    }
}
