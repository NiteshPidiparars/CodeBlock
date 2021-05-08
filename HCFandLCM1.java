import java.util.*;
public class HCFandLCM1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,min,hcf=1,i,lcm;
        System.out.println("Enter two number: ");
        a=sc.nextInt();
        b=sc.nextInt();
        min=a<b?a:b;
        for(i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        System.out.println("HCF is: "+hcf);
        lcm=(a*b)/hcf;
        System.out.println("LCM is: "+lcm);
    }
}
