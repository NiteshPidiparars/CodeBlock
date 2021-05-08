/* WAP a program in Java to a accept a word arrange all the alphabets
   of the word in ascending order and display the new word.
   Input : BLUEJ
   Output : BEJLU */
import java.util.*;
public class SortLettersInWord
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String w;
        int i,l;
        char ch,cs;
        System.out.println("Enter the Word : ");
        w = sc.next();
        l = w.length();
        for(cs='A';cs<='Z';cs++){
            for(i=0;i<l;i++){
                ch = w.charAt(i);
                if(ch == Character.toUpperCase(cs)){
                    System.out.print(ch);
                }
            }
        }
        System.out.println();
    }
}
