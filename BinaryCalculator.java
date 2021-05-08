import java.util.*;
class BinaryCalculator
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Binary: ");
        String binOne=sc.nextLine();
        System.out.println("Enter second Binary: ");
        String binTwo=sc.nextLine();
        int left=Integer.parseInt(binOne,2);
        int right=Integer.parseInt(binTwo,2);
        System.out.println("Sum of Binary number: "+Integer.toBinaryString(left+right));
        System.out.println("Difference of Binary number: "+Integer.toBinaryString(left-right));
        System.out.println("Product of Binary number: "+Integer.toBinaryString(left*right));
        System.out.println("Quotient of Binary number: "+Integer.toBinaryString(left/right));
    }
}
