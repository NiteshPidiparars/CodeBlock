class CircleDemo
{
    public static void main(String[]args)
    {
        CircleTest cl=new CircleTest();
        double redius=cl.getRedius();
        System.out.println(redius);
        String color=cl.getColor();
        System.out.println(color);
    }
}
class CircleTest
{
    double redius=2.3;
    String color="White";
    double getRedius()
    {
        return redius;
    }
    String getColor()
    {
        return color;
    }
}
