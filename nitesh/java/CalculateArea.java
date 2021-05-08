import java.util.Scanner;
public class CalculateArea
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breath of a rectangle : ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int ar = l*b;
        System.out.println("Area of Rectangle is : "+ar);
    }
}
