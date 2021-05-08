import java.util.*;
public class PerfectSquareRange
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int start,end,n,sum=0,i;
        float s;
        System.out.println("Enter the start value of range: ");
        start=sc.nextInt();
        System.out.println("Enter the end value of range: ");
        end=sc.nextInt();
        System.out.println("The Perfect Square number present in the range "+start+" to "+end+" are: ");
        for(i=start;i<=end;i++)
        {
            s=(float)Math.sqrt(i);
            n=(int)Math.floor(s);
            if(s==n){
                System.out.println(" "+i);
                sum=sum+i;
            }
        }
        System.out.println("The Sum of Perfect Square number present in the range "+start+" to "+end+" are: "+sum);
    }
}
