import java.util.*;
public class Niven(Harshad)number
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int c=n,sum=0,d;
        while(c>0){
            d=c%10;
            sum=sum+d;
            c=c/10;
        }
        if(n%sum==0)
            System.out.println(n+" is Niven(Harshad) number");
        else
            System.out.println(n+" is not Niven(Harshad) number");
    }
}
