import java.util.Scanner;
public class FirstNEvenNaturalNumber
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.print(" "+(2*i-1));
            i++;
        }
    }
}
