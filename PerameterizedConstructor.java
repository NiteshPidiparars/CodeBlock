class PerameterizedConstructor
{
    PerameterizedConstructor(int n1,int n2)
    {
        int add;
        add=n1+n2;
        System.out.println("Addition of Number: "+add);
    }
    public static void main(String[]args)
    {
        PerameterizedConstructor pc=new PerameterizedConstructor(30,40);
    }
}
