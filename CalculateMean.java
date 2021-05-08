import java.util.*;
class CalculateMean
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,numInput;
        float mean;
        System.out.println("Enter the number to calculate mean: ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            numInput=sc.nextInt();
            sum=sum+numInput;
        }
        mean=sum/n;
        System.out.println("Mean is: "+mean);
    }
}
