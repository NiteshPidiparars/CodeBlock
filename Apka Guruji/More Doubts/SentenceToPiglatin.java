/* WAP in Java to accept a sentence and convert
   to PIGLATIN form.
   Sample Input : JAVA IS A BEAUTIFUL LANGUAGE
   Output : AVAJAY ISAY AAY EAUTIFULBAY ANGUAGELAY */
import java.util.*;
public class SentenceToPiglatin
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s,w="",rp,lp,nw,rs="";
        int i,l,wl,j;
        char ch;
        System.out.println("Enter the String : ");
        s = sc.nextLine();
        s = s+" ";
        l = s.length();
        for(i=0; i<l; i++){
            ch = s.charAt(i);
            if(ch !=' ')
                w += ch;
            else{
                wl = w.length();
                for(j=0; j<wl; j++){
                    ch = w.charAt(j);
                    if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
                        break;
                }
                lp = w.substring(0,j);
                rp = w.substring(j);
                nw = rp + lp + "AY";
                rs = rs + nw + " ";
                w = "";
            }
        }
        rs = rs.trim();//rs = rs.substring(0,rs.length()-1);
        System.out.println("Resulting Sentence : "+rs);
    }
}
