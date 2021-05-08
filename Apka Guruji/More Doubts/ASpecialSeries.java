/* WAP to display following series :
   1 15 151 1515 15151......n terms */
import java.util.*;
public class ASpecialSeries
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int i,n,t=0;
        System.out.println("Enter the value for n : ");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            if(i%2==1)
                t = t*10+1;
            else
                t = t*10+5;
            System.out.print(t+" ");
        }
    }
}
