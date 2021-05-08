import java.util.*;
public class AmicableNumber
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        boolean flag=check(a,b);
        if(flag)
            System.out.println("Amicable number");
        else
            System.out.println("Not Amicable number");
    }
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
}
