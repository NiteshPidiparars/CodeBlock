abstract class Shape
{
    abstract void draw();
}
class Rectangle extends Shape
{
    public void draw()
    {
        System.out.println("draw Rectangle");
    }
}
class Triangle extends Shape
{
    public void draw()
    {
        System.out.println("draw Triangle");
    }
}
class AbstractTest
{
    public static void main(String[]args)
    {
        Shape s1=new Rectangle();
        s1.draw();
        s1=new Triangle();
        s1.draw();
    }
}
