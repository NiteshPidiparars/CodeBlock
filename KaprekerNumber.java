import java.util.*;
class KaprekerNumber
{
    int digitCount(int n)
    {
        int digits=0;
        while(n!=0){
            digits++;
            n=n/10;
        }
        return digits;
    }
    public static void main(String[]args)
    {
        int quo,res,n,sq,temp,digits;
        Scanner sc=new Scanner(System.in);
        KaprekerNumber kp=new KaprekerNumber();
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        sq=n*n;
        digits=kp.digitCount(n*n);
        quo=sq/(int)Math.pow(10,digits/2);
        res=sq%(int)Math.pow(10,digits/2);
        temp=quo+res;
        if(temp==n)
            System.out.println(n+" is a KaprekerNumber");
        else
            System.out.println(n+" is not KaprekerNumber");
    }
}
