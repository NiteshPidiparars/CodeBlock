/*
    WAP in Java to accept a sentence and convert
    to PIGLATIN form.
*/
import java.util.*;
public class PigLatinUsingStringTokenizer
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s,w="",lp,rp,nw,rs="";
        int wl,j;
        char ch;
        System.out.println("Enter the sentences : ");
        s = sc.nextLine().toUpperCase();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            w = st.nextToken();
            wl = w.length();
            for(j=0;j<wl;j++){
                ch = w.charAt(j);
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                    break;
            }
            lp = w.substring(0,j);
            rp = w.substring(j);
            nw = rp + lp + "AY";
            rs = rs + nw + " ";
        }
        rs = rs.trim();//rs = rs.substring(0,rs.length()-1);
        System.out.println("Resulting Sentences : "+rs);
    }
}

