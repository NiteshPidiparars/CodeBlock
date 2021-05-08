class CircleDemo
{
    public static void main(String[]args)
    {
        CircleTest c=new CircleTest();
        String color=c.getcolor();
        System.out.println(color);
    }
}
class CircleTest
{
    double radius=2.3;
    String color="White";
    double getRadius()
    {
        return radius;
    }
    String getcolor()
    {
        return color;
    }
}
