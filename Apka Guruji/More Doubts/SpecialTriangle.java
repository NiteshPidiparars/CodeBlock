/* Alternately Reversed lines in a Diamond
                    1
                    2   1
                    1   2   3
                    4   3   2   1
                    1   2   3   4   5
                    6   5   4   3   2   1
                    1   2   3   4   5   6   7  */
import java.util.*;
public class SpecialTriangle
{
    public static void main(String[]args)
    {
        int i,j;
        boolean reverse=false;
        for(i=1;i<=7;i++){
            if(reverse)
                for(j=i;j>=1;j--)
                    System.out.print(j);
            else
                for(j=1;j<=i;j++)
                    System.out.print(j);
                System.out.println();
                reverse = !reverse;
        }
    }
}

