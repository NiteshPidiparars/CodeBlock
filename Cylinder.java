import java.util.*;
class Cylinder
{
    public static void main(String[]args)
    {
        double PI=3.14;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Redius: ");
        double r=sc.nextDouble();
        System.out.println("Enter Height: ");
        double h=sc.nextDouble();
        double volume=PI*r*r*h;
        double area=2*PI*r*(r+h);
        System.out.println("Volume of Cylinder is: "+volume);
        System.out.println("Area of Cylinder is: "+area);
    }
}
