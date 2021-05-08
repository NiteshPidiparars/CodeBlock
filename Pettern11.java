import java.util.*;
class Pettern11
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,t=1;
        System.out.println("Enter the value of N: ");
        n=sc.nextInt();
        System.out.println(1);
        System.out.println("The Pattern is: ");
        for(i=1;i<n;i++){
            t=t*11;
            System.out.println(t-1);
        }
    }
}
