import java.io.*;
class SpecialNumber
{
    public boolean isSpecial(int n)
    {
        int temp=n,spec=0;
        while(temp%10!=0){
            spec=spec+factorial(temp%10);
            temp=temp/10;
        }
        if(spec==n)
            return true;
        else
            return false;
    }
    private int factorial(int n)
    {
        if((n==1)||(n==0))
            return 1;
        return(n*factorial(n-1));
    }
    public static void main(String[]args)throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        int n=Integer.parseInt(bf.readLine());
        SpecialNumber sn=new SpecialNumber();
        if(sn.isSpecial(n))
                System.out.println(n+" is a SpecialNumber");
            else
                System.out.println(n+" is not SpecialNumber");
    }
}
