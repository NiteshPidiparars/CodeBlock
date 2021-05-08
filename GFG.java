import java.io.*;
interface Vehicle
{
    void changeGear(int a);
    void speedUp(int a);
    void appyBrakes(int a);
}
class Bicycle implements Vehicle
{
    int speed;
    int gear;
    public void changeGear(int newGear)
    {
        gear=newGear;
    }
    public void speedUp(int increment)
    {
        speed=speed+increment;
    }
    public void appyBrakes(int decrement)
    {
        speed=speed-decrement;
    }
    public void printStates()
    {
        System.out.println("speed: "+speed+"gear: "+gear);
    }
}
class Bike implements Vehicle
{
    int speed;
    int gear;
    public void changeGear(int newGear)
    {
        gear=newGear;
    }
    public void speedUp(int increment)
    {
        speed=speed+increment;
    }
    public void appyBrakes(int decrement)
    {
        speed=speed-decrement;
    }
    public void printStates()
    {
        System.out.println("speed: "+speed+" gear: "+gear);
    }
}
class GFG
{
    public static void main(String[]args)
    {
        Bicycle bicycle=new Bicycle();
        bicycle.changeGear(4);
        bicycle.speedUp(3);
        bicycle.appyBrakes(1);
        System.out.println("Bicycle in present state: ");
        bicycle.printStates();
        Bike bike=new Bike();
        bike.changeGear(2);
        bike.speedUp(4);
        bike.appyBrakes(5);
        System.out.println("Bike in present state: ");
        bike.printStates();
    }
};
