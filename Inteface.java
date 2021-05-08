interface A
{
    public void methodA();
}
interface B extends A
{
    public void methodB();
}
interface C extends A
{
    public void methodC();
}
class Inteface implements B,C
{
    public void methodA()
    {
        System.out.println("Method A");
    }
    public void methodB()
    {
        System.out.println("Method B");
    }
    public void methodC()
    {
        System.out.println("Method C");
    }
    public static void main(String[]args)
    {
       Inteface in=new Inteface();
       in.methodA();
       in.methodB();
       in.methodC();
    }
}
