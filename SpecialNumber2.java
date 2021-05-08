import java.io.*;
class SpecialNumber2
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n,digits,div,s=0,f=1,i;
        System.out.println("Enter the number: ");
        n=Integer.parseInt(bf.readLine());
        for(div=n;div>0;div=div/10){
            digits=div%10;
            f=1;
            for(i=1;i<=digits;i++){
                f=f*i;
            }
            s=s+f;
        }
        if(s==n)
            System.out.println("its Special number");
        else
            System.out.println("its not Special number");
    }
}
