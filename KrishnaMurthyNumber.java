import java.io.*;
class KrishnaMurthyNumber
{
    int fact(int n)
    {
        int i,fact=1;
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
     public static void main(String[]args)throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        int n=Integer.parseInt(bf.readLine());
        KrishnaMurthyNumber kmn=new KrishnaMurthyNumber();
        if(kmn.isKrishnaMurthy(n))
            System.out.println(n+" is a KrishnaMurthyNumber");
        else
            System.out.println(n+" is not KrishnaMurthyNumber");
    }
    public boolean isKrishnaMurthy(int n)
    {
        int temp,k=0,m=n;
        while(n>0){
            temp=n%10;
            k=k+fact(temp);
            n=n/10;
        }
        if(k==m)
            return true;
        else
            return false;
    }
}
