import java.util.*;
class CoPrime
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,hcf=1,i,min;
        System.out.println("Enter the number: ");
        a=sc.nextInt();
        b=sc.nextInt();
        min=a<b?a:b;
        for(i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        if(hcf==1)
            System.out.println("its CoPrime");
        else
            System.out.println("its not CoPrime");
    }
}
