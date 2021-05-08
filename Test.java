interface in1
{
    final int a=10;
    static void display()
    {
        System.out.println("Hello");
    }
}
    class Test implements in1
    {
        public static void main(String[]args){

        in1.display();
    }
}
