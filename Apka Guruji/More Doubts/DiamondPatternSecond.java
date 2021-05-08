/* Display following pattern :
            123456789
            1234 6789
            123   789
            12     89
            1       9
            12     89
            123   789
            1234 6789
            123456789 */
import java.util.*;
public class DiamondPatternSecond
{
    public static void main(String[]args)
    {
        int size=9,i,j,k,sp=0;
        for(i=1;i<=size;i++){
            for(j=1;j<=size;j++){
                if(j>size/2-sp/2+1 && j<=size/2 + sp/2)
                    System.out.print(" ");
                else
                    System.out.print(j);
            }
            System.out.println();
            sp = (i<=size/2)?sp+2:sp-2;
        }
    }
/*  public static void main(String[]args)
    {
        int i,j,sp,e;
        for(j=1;j<=9;j++)
            System.out.print(j);
        System.out.println();
        e=4;
        sp=1;
        for(i=1;i<=4;i++){
            for(j=1;j<=e;j++)
                System.out.print(j);
            for(j=1;j<=sp;j++)
                System.out.print(" ");
            for(j=10-e;j<=9;j++)
                System.out.print(j);
            sp+=2;
            e--;
            System.out.println();
        }
        e=2;
        sp=5;
        for(i=1;i<=3;i++){
            for(j=1;j<=e;j++)
                System.out.print(j);
            for(j=1;j<=sp;j++)
                System.out.print(" ");
            for(j=10-e;j<=9;j++)
                System.out.print(j);
            sp-=2;
            e++;
            System.out.println();
        }
        for(j=1;j<=9;j++)
            System.out.print(j);
    }   */
}
