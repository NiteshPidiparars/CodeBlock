/* WAP to compute the middle digit of any entered number.
   if the number does not have a middle digit it has to return
   the average of the middle two digits using array? */
import java.util.*;
public class MiddleDigit
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,arr[]=new int[10],div;
        int i,mid;
        double avg;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        i=0;
        for(div=n;div>0;div/=10)
            arr[i++] = div%10;
        if(i%2==1){
            mid = arr[i/2];
            System.out.println("Middle Digit is : "+mid);
        }else{
            avg = (arr[i/2] + arr[i/2-1])/2.0;
            System.out.println("Average of Middle Digits : "+avg);
        }
    }
}
