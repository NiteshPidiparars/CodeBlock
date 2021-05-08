import java.io.*;
class PrimeFactor
{
    private boolean prime(int n)
    {
        boolean b=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                b=false;
        }
        return b;
    }
    public static void main(String[]args)throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        int n=Integer.parseInt(bf.readLine());
        PrimeFactor pm=new PrimeFactor();
        System.out.println("Prime Factor of "+n+" are: ");
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                boolean b=pm.prime(i);
                if(b==true)
                    System.out.println(i+"");
            }
        }
    }
}
