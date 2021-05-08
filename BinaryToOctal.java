import java.io.*;
class BinaryToOctal
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Binary number: ");
        String num=bf.readLine();
        int bin=Integer.parseInt(num,2);
        String Octal=Integer.toOctalString(bin);
        System.out.println("Binary to Octal ");
        System.out.println("Octal is: "+Octal);
    }
}
