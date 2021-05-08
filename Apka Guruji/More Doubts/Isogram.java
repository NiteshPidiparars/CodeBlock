/* WAP to check Isogram word. An Isogram is a word in which
   not letter occurs more then once. */
import java.util.*;
public class Isogram
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        char ch;
        int flags[]=new int[26],i,l;
        System.out.println("Enter the word : ");
        s = sc.next();
        l = s.length();
        for(i=0;i<l;i++){
            ch = Character.toUpperCase(s.charAt(i));
            if(flags[ch-65] == 1)
                break;
            else
                flags[ch-65] = 1;
        }
        if(i == l)
            System.out.println("It is Isogram");
        else
            System.out.println("Not Isogram");
    }
}
