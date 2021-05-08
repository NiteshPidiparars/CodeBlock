class SuperClass
{
    void display()
    {
        System.out.println("Hello SuperClass");
    }
}
class Polymorphism extends SuperClass
{
    void display()
    {
        System.out.println("Hello Poly");
    }
    public static void main(String[]args)
    {
        SuperClass sp=new Polymorphism();
        sp.display();
    }
}
