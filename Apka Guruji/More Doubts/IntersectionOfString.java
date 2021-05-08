/* WAP to accept two words and find out the set
   that will be formed by the intersection of the
   character found in both the string.
   Sample Input : DISARI, HALDIA
   Output : DIA  */
import java.util.*;
public class IntersectionOfString
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s1,s2,rs="";
        int l,i,prs,ps2;
        char cs;
        System.out.println("Enter the first string : ");
        s1 = sc.nextLine().toUpperCase();
        System.out.println("Enter the first string : ");
        s2 = sc.nextLine().toUpperCase();
        l = s1.length();
        System.out.println("Intersection Of String is : ");
        for(i=0;i<l;i++){
            cs = s1.charAt(i);
            prs = rs.indexOf(cs);
            ps2 = s2.indexOf(cs);
            if(prs==-1 && ps2!=-1)
                rs += cs;
        }
        System.out.println(rs);
    }
}

