/* Consider the following string array and given the output. */
import java.util.*;
public class FindingOutput
{
    public static void main(String[]args)
    {
        String arr[] = {"DELHI","CHENNAI","MUMBAI","LUCKNOW","JAIPUR"};
        System.out.println(arr[0].length() > arr[3].length());
        System.out.println(arr[4].substring(0,3));
    }
}
