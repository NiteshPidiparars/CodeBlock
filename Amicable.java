import java.io.*;
class Amicable
{
    static boolean check(int a,int b)
    {
        int s=0,i;
        for(i=1;i<a;i++){
            if(a%i==0){
                s=s+i;
            }
        }
        if(s==b){
            s=0;
            for(i=1;i<b;i++){
                if(b%i==0){
                    s=s+i;
                }
            }
            if(s==a)
                return true;
            else
                return false;
        }
        return false;
    }
    public static void main(String[]args)throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1st no.: ");
        int a=Integer.parseInt(bf.readLine());
        System.out.println("Enter 2nd no.: ");
        int b=Integer.parseInt(bf.readLine());
        if(check(a,b))
            System.out.println(a+" and "+b+" are Amicable number");
        else
            System.out.println(a+" and "+b+" are not Amicable number");
    }
}
