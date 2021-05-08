import java.io.*;
class BufferedReader4
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        double f,c;
        System.out.println("Enter the ferenheight is: ");
        f=Double.parseDouble(bf.readLine());
        c=(f-32)*5/9;
        System.out.println("Result is: "+c+"°celcius");
        }
}
