interface MyInterface
{
    public String hello="Hello";
    public void sayHello();
}
interface MyOtherInterface
{
    public void sayGoodBye();
}
class MyInterfaceImpl implements MyInterface,MyOtherInterface
{
    public void sayHello()
    {
        System.out.println("Hello");
    }
    public void sayGoodBye()
    {
        System.out.println("GoodBye");
    }
    public static void main(String[]args)
    {
        MyInterfaceImpl m1=new MyInterfaceImpl();
        m1.sayHello();
        m1.sayGoodBye();
    }
}
