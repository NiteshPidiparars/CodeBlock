import java.io.*;
class AdamNumber
{
    int CountNumberOfDigits(int n)
    {
        int numDigits=0;
        do{
            n=n/10;
            numDigits++;
        }while(n>0);
        return numDigits;
    }
    int ReverseNumber(int n)
    {
        int i=0,result=0;
        int numDigits=CountNumberOfDigits(n);
        for(i=0;i<numDigits;i++){
            result=result*10;
            result=result+n%10;
            n=n/10;
        }
        return result;
    }
    public static void main(String[]args)throws IOException
    {
        BufferedReader bf=new BufferedReader(new  InputStreamReader(System.in));
        System.out.println("Enter the minimum number of range: ");
        int min=Integer.parseInt(bf.readLine());
        System.out.println("Enter the maximum number of range: ");
        int max=Integer.parseInt(bf.readLine());
        AdamNumber an=new AdamNumber();
        System.out.println("Adam Numbers.");
        for(int i=min;i<max;i++){
            int n=i;
            int rn=an.ReverseNumber(i);
            if(n==rn){
                continue;
            }
            int sqrn=n*n;
            int sqrm=rn*rn;
            int revsqrm=an.ReverseNumber(sqrm);
            if(revsqrm==sqrn){
                System.out.println(n+"\n");
            }
        }
        System.out.println();
    }
}
