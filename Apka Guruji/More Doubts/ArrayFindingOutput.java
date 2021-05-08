import java.util.*;
public class ArrayFindingOutput
{
    public static void main(String[]args)
    {
        int arr[] = {3,4,5,6,7};
        int i;
        for(i=arr.length-1;i>0;i--)
            arr[i-1] += arr[i];
        for(i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
