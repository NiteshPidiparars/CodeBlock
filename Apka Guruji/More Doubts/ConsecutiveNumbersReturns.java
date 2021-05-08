/* WAP in Java to accept 20 numbers and print the pair of consecutive :
   Ex Input - 34,78,62,54,82,64,74,95,79,55.........any 20 n.o s then
      Output - 54 and 55,
               78 and 79 etc. */
import java.util.*;
public class ConsecutiveNumbersReturns
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20],i,j;
        System.out.println("Enter the number : ");
        for(i=0;i<arr.length;i++)
            arr[i] = sc.nextInt();
        for(i=1;i<arr.length;i++){
            for(j=i;j<arr.length;j++){
                if(Math.abs(arr[i]-arr[j])==1){
                    System.out.println(arr[i]+" "+arr[j]);
                    break;
                }
            }
        }
    }
}
