class MethodOverloading1
{
    public void display(int n)
    {
        System.out.println("Integer value is: "+n);
    }
    public void display(float f)
    {
        System.out.println("Float value is: "+f);
    }
    public void display(char c)
    {
        System.out.println("Character is: "+c);
    }
}
class MethodOverloading
{
    public static void main(String[]args)
    {
        MethodOverloading1 m=new MethodOverloading1();
        m.display(20);
        m.display(2.0f);
        m.display('z');
    }
}
