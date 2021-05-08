/* Input string and display the highest and lowest repeating
   character within a string. */
import java.util.*;
public class MostFrequentCharacter
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        char ch,cs;
        int i,l,fch,fsc;
        System.out.println("Enter the string : ");
        s = sc.next();
        l = s.length();
        ch = s.charAt(0);
        fch = frequency(s,ch);
        for(i=1;i<l;i++){
            cs = s.charAt(i);
            fsc = frequency(s,cs);
            if(fsc<fch){
                fch = fsc;
                ch = cs;
            }
        }
        System.out.println(ch + " reapeates smallest (" + fch +") times");
        ch = s.charAt(0);
        fch = frequency(s,ch);
        for(i=1;i<l;i++){
            cs = s.charAt(i);
            fsc = frequency(s,cs);
            if(fsc>fch){
                fch = fsc;
                ch = cs;
            }
        }
        System.out.println(ch + " reapeates largest (" + fch +") times");
    }
    static int frequency(String s, char cs)
    {
        int i,l,f=0;
        l = s.length();
        for(i=0;i<l;i++){
            if(cs == s.charAt(i))
                f++;
        }
        return f;
    }
}
