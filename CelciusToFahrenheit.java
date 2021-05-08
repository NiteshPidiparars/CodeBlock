import java.util.*;
class CelciusToFahrenheit
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Celcius: ");
        double temp=sc.nextDouble();
        temp=(temp*9/5.0)+32;
        System.out.println("Celsius To Fahrenheit is: "+temp);
    }
}
