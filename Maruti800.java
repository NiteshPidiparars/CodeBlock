class Car
{
    public Car()
    {
        System.out.println("Class: Car");
    }
    public void VehicleType()
    {
        System.out.println("VehicleType: Car");
    }
}
class Maruti extends Car
{
    public Maruti()
    {
        System.out.println("Maruti Swift");
    }
    public void Brand()
    {
        System.out.println("Brand: Maruti");
    }
    public void speed()
    {
        System.out.println("Speed: 250m/h");
    }
}
class Maruti800 extends Maruti
{
    public Maruti800()
    {
        System.out.println("Class Maruti800");
    }
    public void speed()
    {
        System.out.println("Speed: 90kmpl");
    }
    public static void main(String[]args)
    {
        Maruti800 m1=new Maruti800();
        m1.VehicleType();
        m1.Brand();
        m1.speed();
    }
}

