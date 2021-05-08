class Constructor1
{
    int id;
    String name;
    int age;
    Constructor1(int i,String n)
    {
        id=i;
        name=n;
    }
    Constructor1(int i,String n,int a)
    {
        id=i;
        name=n;
        age=a;
    }
    void display()
    {
        System.out.println(id+""+name+""+age+"");
    }
    public static void main(String[]args)
    {
        Constructor1 cl=new Constructor1(01," abc");
        Constructor1 cl1=new Constructor1(02," abd ",18);
        cl.display();
        cl1.display();
    }
}
