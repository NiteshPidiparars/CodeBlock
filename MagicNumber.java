import java.io.*;
public class MagicNumber
{
    private int input()throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        return Integer.parseInt(bf.readLine());
    }
    public boolean isMagicNumber(int n)
    {
        int sum=0,flag,d=0;
        do
        {
            flag=0;
            while(n%10==0){
                n=n/10;
            }
            while(n%10!=0||n>0){
                sum=sum+(n%10);
                n=n/10;
            }
            if(sum>=10){
                n=sum;
                sum=0;
            }
            else
                flag=1;
            }
            while(flag==0);
            if(sum==1)
                return true;
            else
                return false;
    }
    public static void main(String[]args)throws IOException
    {
        MagicNumber mn=new MagicNumber();
        int num=mn.input();
        if(mn.isMagicNumber(num))
            System.out.println(num+" is MagicNumber");
        else
            System.out.println(num+" is not MagicNumber");
    }
}
