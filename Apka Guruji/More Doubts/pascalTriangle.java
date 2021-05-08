/* WAP in Java to store and display first N
   Lines of Pascal's triangle in an array*/
import java.util.*;
public class pascalTriangle
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int i,j,n,arr[],sp;
        System.out.println("How many lines you want?");
        n = sc.nextInt();
        arr = new int[n+1];
        arr[0] = 1;
        sp = n;
        for(i=0;i<n;i++){
            for(j=1;j<=sp;j++)
                System.out.print(" ");
            for(j=0;j<=i;j++)
                System.out.print(arr[j]+" ");
            for(j=i+1;j>0;j--)
                arr[j] = arr[j] + arr[j-1];
            System.out.println();
            sp--;
        }
    }
}

