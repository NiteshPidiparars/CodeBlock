/* Alternately Reversed lines in a Diamond
                    a
                c   b   a
            a   b   c   d   e
        g   f   e   d   c   b   a
    a   b   c   d   e   f   g   h   i
        g   f   e   d   c   b   a
            a   b   c   d   e
                c   b   a
                    a  */
import java.util.*;
public class DiamondPattern
{
    public static void main(String[]args)
    {
        char i,j;
        int k,sp=4;
        boolean reverse=false;
        for(i='a';i<='i';i+=2){
            for(k=1;k<=sp;k++)
                System.out.print(" ");
            if(reverse)
                for(j=i;j>='a';j--)
                    System.out.print(j);
            else
                for(j='a';j<=i;j++)
                    System.out.print(j);
                System.out.println();
            reverse = !reverse;
            sp--;
        }
        sp=1;
        for(i='g';i>='a';i-=2){
            for(k=1;k<=sp;k++)
                System.out.print(" ");
            if(reverse)
                for(j=i;j>='a';j--)
                    System.out.print(j);
            else
                for(j='a';j<=i;j++)
                    System.out.print(j);
                System.out.println();
            reverse = !reverse;
            sp++;
        }
    }
}

