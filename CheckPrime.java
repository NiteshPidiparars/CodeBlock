import java.util.*;
class CheckPrime
{
    public static void main(String[]args)
    {
        int res;
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        for(int i=2;i<=n/2;i++){
            res=n%i;
            if(res==0){
                flag=false;
                break;
            }
        }
            if(flag)
                System.out.println(n+" is prime");
            else
                System.out.println(n+" is not prime");
    }
}
