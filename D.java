interface A
{
    public void methodA();
}
interface B extends A
{
    public void methodB();
}
interface C extends B
{
    public void methodC();
}
class D implements B,C
{
    public void methodA()
    {
        System.out.println("A");
    }
    public void methodB()
    {
        System.out.println("B");
    }
    public void methodC()
    {
        System.out.println("C");
    }
    public static void main(String[]args)
    {
        D o1=new D();
        o1.methodA();
        o1.methodB();
        o1.methodC();
    }
}
