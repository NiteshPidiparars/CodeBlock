class Parent
{
    String name;
}
class Inheritance extends Parent
{
    String name;
    public void detailAdress()
    {
        super.name="Parent";
              name="Child";
              System.out.println(super.name+" and "+name);
    }
    public static void main(String[]args)
    {
        Inheritance in=new Inheritance();
        in.detailAdress();
    }
}
