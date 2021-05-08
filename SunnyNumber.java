import java.io.*;
class SunnyNumber
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        int n,n1;
        double x;
        n=Integer.parseInt(bf.readLine());
        n1=n+1;
        x=Math.sqrt(n1);
        if((int)x==x)
            System.out.println("Number is SunnyNumber");
        else
            System.out.println("Number is not SunnyNumber");
    }
}
