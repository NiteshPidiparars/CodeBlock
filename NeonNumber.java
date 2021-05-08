import java.io.*;
class NeonNumber
{
    public static void main(String[]args)throws IOException
    {
       int n,sum=0,square;
       BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the number: ");
       n=Integer.parseInt(bf.readLine());
       square=n*n;
       String sqs=Integer.toString(square);
       for(int i=0;i<sqs.length();i++){
        sum=sum+Integer.parseInt(sqs.substring(i,i+1));
       }
       if(sum==n)
            System.out.println(n+" is a NeonNumber");
         else
            System.out.println(n+" is not NeonNumber");
    };
};
