import java.util.*;
class Scanner2
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        double msal,asal,tex;
        System.out.println("Enter the monthly salary: ");
        msal=sc.nextInt();
        asal=msal*12;
        tex=msal*15/100;
        System.out.println("Annual salary is: "+asal);
        System.out.println("Tex is: "+tex);
    }
}
