import java.util.*;
class  Series3
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s,sum=0,j;
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
                s=0;
            for(j=1;j<=i;j++)
                sum=sum+j*j;
            }
            System.out.println(sum);
    }
}
