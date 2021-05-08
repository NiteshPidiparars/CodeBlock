import java.util.*;
class HCFandLCM
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int h=1;
        int p=m*n;
        for(int i=2;i<p;i++){
            if(m%i==0 && n%i==0){
                h=i;
            }
        }
        int l=p/h;
        System.out.println("HCF is: "+h+" and LCM is: "+l);
    }
}
