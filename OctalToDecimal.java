import java.io.*;
class OctalToDecimal
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String n;
        System.out.println("Enter the octal number: ");
        n=bf.readLine();
        int decimalNumber=Integer.parseInt(n,8);
        System.out.println("Octal Converted into Decimal");
        System.out.println("Decimal is: "+decimalNumber);
    }
}
