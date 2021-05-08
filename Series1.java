import java.util.*;
class Series1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int i,v,n;
        double a,s;
        System.out.println("Enter the value of a and n: ");
        n=sc.nextInt();
        a=sc.nextDouble();
        s=0;
        v=1;
        for(i=1;i<=n;i++){
            s=s+(v-a)/(v+1);
            v+=2;
        }
        System.out.println("Result is: "+s);
    }
}
