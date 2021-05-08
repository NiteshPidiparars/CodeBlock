/*WAP to suppress negative elements of an array of 10 elements to bottom
i.e, if array contains 5,-4,3,-2,6,-11,12,-8,9
then it will print 5,3,6,12,9,-4,-2,-11,-8
*/
import java.util.*;
public class IsolateNegatives
{
    public static void main(String args[])
    {
        int arr[] = {5,-4,3,-2,6,-11,12,-8,9};
        int i,j,t;
        for(i=1;i<arr.length;i++){
            for(j=0;j<arr.length-1;j++){
                if(arr[j]<0 && !(arr[j+1]<0)){
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println("The Array is: ");
        for(i=1;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
