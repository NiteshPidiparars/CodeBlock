/* Display following pattern :
                1
            2   3   2
        3   4   5   4   3
    4   5   6   7   6   5   4
4   6   7   8   9   8   7   6   5 */
import java.util.*;
public class SpecialPyramidPattern
{
    public static void main(String[]args)
    {
        int i,j,sp=4;
        for(i=1;i<=5;i++){
            for(j=1;j<=sp;j++)
                System.out.print("  ");
            for(j=0;j<i;j++)
                System.out.print(i+j+" ");
            for(j=i-2;j>=0;j--)
                System.out.print(i+j+" ");
            System.out.println();
            sp--;
        }
    }
}
