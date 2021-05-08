import java.util.*;
class GCDLCM
{
    public static void main(String[]args)
    {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number: ");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("GCD of number: "+gcd(x,y));
        System.out.println("LCM of number: "+lcm(x,y));
    }
    static int gcd(int x,int y)
    {
        int r=0,a,b;
        a=(x>y)?x:y;
        b=(x<y)?x:y;
        r=b;
        while(a%b!=0){
            r=a%b;
            a=b;
            b=r;
        }
        return r;
    }
    static int lcm(int x,int y)
    {
        int a;
        a=(x>y)?x:y;
        while(true){
            if(a%x==0&&a%y==0){
                return a;
            }
            ++a;
        }
    }
}
