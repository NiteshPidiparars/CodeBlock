/* Write a Java program to accept a number and print a mock
   arithmetic sequence of that many terms.
   First Example :
        Input(n) = 6
        Output(s) = 2,5,6,8,9,12
        Reason for this output: 2+12=5+9=6+8=14
   Second Example :
        Input(n) = 5
        Output(s) = 2,5,7,9,12
        Reason for this output: 2+12=5+9=7+7=14 */
import java.util.*;
public class MockAirthmeticSeries
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,m,i,d;
        int arr[];
        System.out.println("Enter value of n : ");
        n = sc.nextInt();
        arr = new int[n];
        m = n/2;
        if(n%2==1){
            arr[m] = n+2;
            d = 2;
            for(i=1;i<=m;i++){
                arr[m-i] = arr[m-i+1] - d;
                arr[m+i] = arr[m+i-1] + d;
                d++;
            }
        }else{
            arr[m-1] = n;
            arr[m] = n+2;
            d = 1;
            for(i=1;i<m;i++){
                arr[m-i-1] = arr[m-i] - d;
                arr[m+i] = arr[m+i-1] + d;
                d+=2;
            }
        }
        System.out.println("The Series is : ");
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
