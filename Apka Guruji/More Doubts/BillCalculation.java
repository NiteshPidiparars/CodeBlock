/* State Electricity board their consumers according to the units
   consumed (per month) as per the given tariff :
   units consumed.          charges
   Up to 100 units.         80paise/unit
   More than 100 up to 200  Rs 1/unit
   More than 200 units.     Rs 1.25/unit
   In addition to the show mentioned charges, every consumer has to
   pay Rs 50 as Service Charge per month..
   Write a program to accept the number of units consumed and calculation bill. */
import java.util.*;
public class BillCalculation
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        double uc,bill=50;
        System.out.println("Enter the number of units consumed : ");
        uc = sc.nextDouble();
        if(uc<=100)
            bill += uc*0.8;
        else if(uc<=200)
            bill += 100*0.8 + (uc-100);
        else
            bill += 80 + 100 + (uc-200)*1.25;
        System.out.println("Total bill is : "+bill);
    }
}
