/* WAP to input 5 number into an array, a number and a position. Now insert
   the number at that position by shifting the rest of the numbers
   to the right. the last element is therefore removed from the array. */
import java.util.*;
public class InsertInArray
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n=5;
        int arr[] = new int[n],i,x,p;
        System.out.println("Enter the "+n+" numbers : ");
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number to insert : ");
        x = sc.nextInt();
        System.out.println("Enter the position (index) to insert to : ");
        p = sc.nextInt();
        for(i=n-2;i>=p;i--)
            arr[i+1] = arr[i];
        arr[p] = x;
        System.out.println("The Resulting array is : ");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
