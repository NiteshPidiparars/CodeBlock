/* Input word and convert it into this form.....
   Input : Red is bright color
   Output : Bright color is Red
   Input : Raj is good singer
   Output : Good singer is Raj. */
import java.util.*;
public class ModifySentence
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s,fp,mp,lp,rs;
        int iofs,ioss;
        System.out.println("Enter the sentence : ");
        s = sc.nextLine();
        iofs = s.indexOf(' ');
        ioss = s.indexOf(' ',iofs+1);
        fp = s.substring(0,iofs);
        mp = s.substring(iofs+1,ioss);
        lp = s.substring(ioss+1);
        lp = Character.toUpperCase(lp.charAt(0)) + lp.substring(1);
        rs = lp + " " + mp + " " + fp;
        System.out.println("Result is : "+rs);
    }
}
