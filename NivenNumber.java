import java.util.*;
class NivenNumber
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int d,sum=0,c=n;
        while(c>0){
            d=c%10;
            sum=sum+d;
            c=c/10;
        }
        if(n%sum==0)
            System.out.println(n+" is a NivenNumber");
        else
            System.out.println(n+" is not NivenNumber");
    }
}
