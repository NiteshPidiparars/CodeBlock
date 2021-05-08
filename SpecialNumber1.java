import java.io.*;
class SpecialNumber1
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int s=0,n,i,f,d,i;
        System.out.println("Enter the number: ");
        n=Integer.parseInt(bf.readLine());
        for(i=n;i>0;i=i/10){
            d=div%10;
            f=1;
            for(i=1;i<=d;i++){
                f=f*i;
            }
            s=s+f;
        }
        if(s==n)
            System.out.println("its SpecialNumber");
        else
            System.out.println("its not SpecialNumber");
    }
}
