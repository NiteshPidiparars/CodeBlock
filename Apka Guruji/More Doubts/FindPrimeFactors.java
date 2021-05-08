/* WAP in Java to accept a number and display its prime factors. */
import java.util.*;
public class FindPrimeFactors
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,x,i;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        x = n;
        for(i=2;x>1;i++){
            while(x%i==0){
                System.out.print(i+" ");
                x = x/i;
            }
        }
    }
}
