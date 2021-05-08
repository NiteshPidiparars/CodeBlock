import java.util.*;
class FahrenheitToCelcius
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Celcius: ");
        double temp=sc.nextDouble();
        temp=(temp-32)*5/9;
        System.out.println("Celsius is: "+temp);
    }
}
