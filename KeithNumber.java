import java.io.*;
class KeithNumber
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        int n=Integer.parseInt(bf.readLine());
        int copy=n;
        String s=Integer.toString(n);
        int d=s.length();
        int a[]=new int[n];
        for(int i=d-1;i>=0;i--)
        {
            a[i]=copy%10;
            copy=copy/10;
        }
        int i=d,sum=0;
        while(sum<n)
        {
            sum=0;
            for(int j=1;j<=d;j++)
            {
                sum=sum+a[i-j];
            }
                a[i]=sum;
                i++;
        }
        if(sum==n)
            System.out.println(n+" is a KeithNumber");
        else
            System.out.println(n+" is not KeithNumber");
    }
}
