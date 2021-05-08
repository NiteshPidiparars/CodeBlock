class A
{
    void display()
    {
        System.out.println("A");
    }
}
class B extends A
{
    void display()
    {
        System.out.println("B");
    }
}
class C extends A
{
    void display()
    {
        System.out.println("C");
    }
}
class MethodOverloadingTest1
{
    public static void main(String[]args)
    {
        A o1=new A();
        B o2=new B();
        C o3=new C();
        o1.display();
        o2.display();
        o3.display();
    }
}
