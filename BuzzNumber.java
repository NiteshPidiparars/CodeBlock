import java.io.*;
class BuzzNumber
{
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    int a;
    public void show()throws IOException
    {
        System.out.println("Enter the number: ");
        a=Integer.parseInt(bf.readLine());
        if(a%10==7||a%7==0)
            System.out.println("Number is BuzzNumber");
        else
            System.out.println("Number is not BuzzNumber");
    }
    public static void main(String[]args)throws IOException
    {
        BuzzNumber ob=new BuzzNumber();
        ob.show();
    }
}
