/* WAP in Java to accept a number and check Niven
   number or not using string */
import java.util.*;
public class NivenNumber
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,s=0;
        String str;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        str = n + "";
        while(str.length()>0){
            s += Integer.parseInt(str.substring(0,1));
            str = str.substring(1);
        }
        if(n%s==0)
            System.out.println("It is Niven Number");
        else
            System.out.println("It is not Niven Number");
    }
}
