/* WAP to accept a string and check it is special or not, also check
   if it is palindrome word not.
   Special Word: a word that starts and ends with the same character
   palindrome: a word that equals to its reverse */
import java.util.*;
public class SpecialPalindrome
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s,r;
        int l,i;
        System.out.println("Enter the string : ");
        s = sc.next();
        l = s.length();
        if(s.charAt(0) == s.charAt(l-1)){
            System.out.println("It is a special word.");
            r="";
            for(i=0;i<l;i++)
                r = s.charAt(i) + r;
            if(r.equalsIgnoreCase(s))
                System.out.println("And also a palindrome.");
            else
                System.out.println("But not palindrome.");
        }else{
            System.out.println("It is not even a special word.");
        }
    }
}
