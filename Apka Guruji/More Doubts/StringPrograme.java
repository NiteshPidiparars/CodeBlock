/* Deleting last 2 character of a word beginning with e or E
   and adding a single letter O in their place.
   Input : Exterminate or eliminate all that is bad.
   Output : Exterminao or eliminao all that is bad. */
import java.util.*;
public class StringPrograme
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s,w="",rs="";
        int i,l;
        char ch;
        System.out.println("Enter the Sentences : ");
        s = sc.nextLine();
        s = s + " ";
        l = s.length();
        for(i=0;i<l;i++){
            ch = s.charAt(i);
            if(ch!=' ')
                w+=ch;
            else{
                ch = w.charAt(0);
                if(ch=='E'||ch=='e')
                    w = w.substring(0,w.length()-2)+"o";
                    rs = rs + w + " ";
                w="";
            }
        }
        rs = rs.substring(0,rs.length()-1);
        System.out.println("Resulting Sentence is : "+rs);
    }
}
