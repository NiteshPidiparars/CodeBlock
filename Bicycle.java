import java.io.*;
interface Vehicle//abstract method
{
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
class Bicycle implements Vehicle
{
    int speed;
    int gear;//to change gear
    public void changeGear(int newGear){
        gear=new Gear;
}
public void speedUp(int increment){
    speed=speed+increment;
}
public void applyBrakes(int decrement){
    speed=speed-decrement;
}
public void printStates(){
    System.out.println("speed: "+speed+" gear: ");
 }
}
class Bike implements Vehicle
{
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}
class Bicycle implements Vehicle
{
    int speed;
    int gear;//to change gear
    public void changeGear(int newGear){
        gear=new Gear;
}
public void speedUp(int increment){
    speed=speed+increment;
}
public void applyBrakes(int decrement){
    speed=speed-decrement;
}
public void printStates(){
    System.out.println("speed: "+speed+" gear: ");
 }
}
class GFG
{
    public static void main(String[]args)
    {
        Bicycle.bicycle=ew Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        System.out.println("Bicycle present states: ");
        bicycle.printStates();
        Bike bike=new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);
        System.out.println("Bike present states: ");
        bike.printStates();
    }
}
