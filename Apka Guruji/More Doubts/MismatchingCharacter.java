/* WAP to accept two strings and count number of unequal characters.
   Input : "abcde" and "pbcq"
   Output : 1+0+0+1+1 = 3. */
import java.util.*;
public class MismatchingCharacter
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        int l1,l2,i,c=0,ml;
        System.out.println("Enter the first string : ");
        s1 = sc.nextLine().toLowerCase();
        System.out.println("Enter the second string : ");
        s2 = sc.nextLine().toLowerCase();
        l1 = s1.length();
        l2 = s2.length();
        ml = Math.min(l1,l2);
        for(i=0;i<ml;i++){
            if(s1.charAt(i) != s2.charAt(i))
                c++;
        }
        c += Math.abs(l1-l2);
        System.out.println("Number of unequal Character : "+c);
    }
}
