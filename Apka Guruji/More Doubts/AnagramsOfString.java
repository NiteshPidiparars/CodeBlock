/* Write an efficient program in Java to check if two strings
   are anagram of each other. An anagram contains the same
   characters but in the different order.
   Example : Army and Mary
   The program should return true if the strings are anagram, false otherwise. */
import java.util.*;
public class AnagramsOfString
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String w1,w2;
        System.out.println("Enter the words : ");
        w1 = sc.next().toLowerCase();
        w2 = sc.next().toLowerCase();
        if(areAnagram(w1,w2)){
            System.out.println("The words are anagram of each other.");
        }else{
            System.out.println("Not anagram.");
        }
    }
    static boolean areAnagram(String w1, String w2)
    {
        int l1,l2;
        int i,j,c1,c2;
        char ch;
        l1 = w1.length();
        l2 = w2.length();
        for(i=0;i<l1;i++){
            ch = w1.charAt(i);
            c1=c2=0;
            for(j=0;j<l1;j++){
                if(ch==w1.charAt(j))
                    c1++;
            }
            for(j=0;j<l2;j++){
                if(ch==w2.charAt(j))
                    c2++;
            }
            if(c1!=c2)
                break;
        }
        if(i==l1)
            return true;
        else
            return false;
    }
}
