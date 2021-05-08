import java.util.Scanner;
public class FirstNoddNaturalNumberSum
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int i=1,sum=0;
        while(i<=n){
            sum = sum + (2*i-1);
            i++;
        }
        System.out.println("Sum is : "+sum);
    }
}
