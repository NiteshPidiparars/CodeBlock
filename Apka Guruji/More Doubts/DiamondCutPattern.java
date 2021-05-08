/* Display following pattern :
            PQRSTSRQP
            PQRS SRQP
            PQR   RQP
            PQ     QP
            P       P
            PQ     QP
            PQR   RQP
            PQRS SRQP
            PQRSTSRQP  */
import java.util.*;
public class DiamondCutPattern
{
    public static void main(String[]args)
    {
        char i,j;
        int k,sp=-1;
        for(i='T';i>='P';i--){
            for(j='P';j<=i;j++)
                System.out.print(j);
            for(k=1;k<=sp;k++)
                System.out.print(" ");
            for(j=i;j>='P';j--){
                if(j!='T')
                    System.out.print(j);
            }
            sp+=2;
            System.out.println();
        }
        sp=5;
        for(i='Q';i<='T';i++){
            for(j='P';j<=i;j++)
                System.out.print(j);
            for(k=1;k<=sp;k++)
                System.out.print(" ");
            for(j=i;j>='P';j--){
                if(j!='T')
                    System.out.print(j);
            }
            sp-=2;
            System.out.println();
        }
    }
}
