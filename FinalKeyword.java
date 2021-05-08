class SuperClass
{
    final int i=10;
    final void display()
    {
        System.out.println("SuperClass");
        System.out.println("Value of final Keyword is: "+i);
    }
}
class FinalKeyword extends SuperClass
{
    public static void main(String[]args)
    {
        FinalKeyword fk=new FinalKeyword();
        fk.display();
    }
}
