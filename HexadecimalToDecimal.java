import java.io.*;
class HexadecimalToDecimal
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String n;
        System.out.println("Enter the octal number: ");
        n=bf.readLine();
        int decimalNumber=Integer.parseInt(n,16);
        System.out.println("Hexadecimal To Decimal");
        System.out.println("Decimal is: "+decimalNumber);
    }
}

