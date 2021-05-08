/* WAP to accept two strings and print only those
   alphabets that are not common between them.
   Sample Input :
   computer
   programming
   Output : acegintu */
import java.util.*;
public class UncommonCharacters
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        int l1,l2,i,j;
        char cs,ch;
        System.out.println("Enter the first string : ");
        s1 = sc.nextLine().toLowerCase();
        System.out.println("Enter the first string : ");
        s2 = sc.nextLine().toLowerCase();
        l1 = s1.length();
        l2 = s2.length();
        System.out.println("The Uncommon Characters are : ");
        for(cs='a';cs<='z';cs++){
            for(i=0;i<l1;i++){
                ch = s1.charAt(i);
                if(ch == cs)
                    break;
            }
            for(j=0;j<l2;j++){
                ch = s2.charAt(j);
                if(ch == cs)
                    break;
            }
            if((i==l1 && j<l2) || (i<l1 && j==l2))
                System.out.print(cs);
        }
    }
}
