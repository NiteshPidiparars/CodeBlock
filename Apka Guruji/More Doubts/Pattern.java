/* Draw Following pattern.
            12345
            12341
            12312
            12123
            11234 */
import java.util.*;
public class Pattern
{
    public static void main(String[]args)
    {
        int i,j;
        for(i=5;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            for(j=1;j<=5-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
