class Parent
{
    String name="Parent";
    public String getName()
    {
        return name;
    }
}
class Child extends Parent
{
    String address="thane ,pune";
    public String getAddress()
    {
        return address;
    }
    public static void main(String[]args)
    {
        Child c1=new Child();
        System.out.println(c1.getName());
        System.out.println(c1.getAddress());
    }
}
