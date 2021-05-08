import java.io.*;
class BinaryToDecimal
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String n;
        System.out.println("Enter the octal number: ");
        n=bf.readLine();
        int decimalNumber=Integer.parseInt(n,2);
        System.out.println("Binary To Decimal");
        System.out.println("Decimal is: "+decimalNumber);
    }
}


