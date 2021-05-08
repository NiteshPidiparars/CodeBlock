class BicycleDemo
{
    public static void main(String[]args)
{
    Bicycle b1=new Bicycle();
    Bicycle b2=new Bicycle();
    b1.changeCadence(50);
    b1.speedUp(10);
    b1.changeGear(5);
    b1.printStates();
    b2.changeCadence(40);
    b2.speedUp(20);
    b2.changeGear(6);
    b2.printStates();
  }
}
class Bicycle
{
    int cadence=0;
    int speed=1;
    int gear=1;
    void changeCadence(int numValue)
    {
        cadence=numValue;
    }
    void changeGear(int numValue)
    {
        gear=numValue;
    }
    void speedUp(int increment)
    {
        speed=speed+increment;
    }
    void applyBreaks(int decrement)
    {
        speed=speed-decrement;
    }
    void printStates()
    {
        System.out.println("cadence: "+cadence+" speed: "+speed+" Gear: "+gear);
    }
}
