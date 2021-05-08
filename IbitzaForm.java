/*WAP in accept a string and convert it to ibitza form:
(divide each word into two parts such that first vowel in the
word should be in the first part and rest of the character in the second
part... after that swap the part with the second part).
Sample1:
Input: muri junction
output: rimu nctionju
Sample2:
Input: aloochop muri khamu
output: lochopa rimu mukha
*/
import java.util.*;
public class IbitzaForm
{
    public static void main(String args[])
    {
        String s = "aloochop muri khamu",w,nw,rs="";
        StringTokenizer st = new StringTokenizer(s);
        int i,iv;
        while(st.hasMoreTokens()){
            w = st.nextToken();
            iv = indexOfVowel(w);
            nw = w.substring(iv+1)+w.substring(0,iv+1);
            rs+=" "+nw;
        }
        rs = rs.substring(1);
        System.out.println("Result: "+rs);
    }
    static int indexOfVowel(String s)
    {
        int i,l=s.length(),pos=-1;
        char ch;
        for(i=0;i<l;i++){
            ch = Character.toLowerCase(s.charAt(i));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                pos = i;
                break;
            }
        }
        return pos;
    }
}
