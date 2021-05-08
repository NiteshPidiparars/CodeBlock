import java.io.*;
class Disarium
{
    public void show(int n)
    {
        int rev,sum,x,c=1;
        x=n;
        rev=0;
        sum=0;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        while(rev>0){
            sum=sum+(int)Math.pow(rev%10,c);
            c++;
            rev=rev/10;
        }
        if(sum==x)
            System.out.println(x+" is a Disarium ");
        else
            System.out.println(x+" is not Disarium");
    }
    public static void main(String[]args)throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        Disarium ob=new Disarium();
        ob.show(Integer.parseInt(bf.readLine()));
    }
};
