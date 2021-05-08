class MethodOverloading
{
    public void display(int n)
    {
        System.out.println("Integer value: "+n);
    }
    public void display(float n)
    {
        System.out.println("Float value: "+n);
    }
    public void display(char n)
    {
        System.out.println("Char value: "+n);
    }
}
class MethodOverloadingTest
{
    public static void main(String[]args)
    {
        MethodOverloading obj=new MethodOverloading();
        obj.display(20);
        obj.display(0.33f);
        obj.display('z');
    }
}
