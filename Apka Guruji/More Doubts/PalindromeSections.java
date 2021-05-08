/* WAP accept a word and find all the palindrome sequences present in it :
   Input : Malayalami
   Output : ala
            Malayalam
            ala */
import java.util.*;
public class PalindromeSections
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s,w="";
        int i,j,l;
        char ch,lc,rc;
        System.out.println("Enter a string : ");
        s = sc.nextLine();
        l = s.length();
        for(i=0;i<l;i++){
            ch = s.charAt(i);
            w=""+ch;
            for(j=1;(i-j)>=0 && (i+j)<l;j++){
                lc = s.charAt(i-j);
                rc = s.charAt(i+j);
                if(Character.toLowerCase(lc) != Character.toLowerCase(rc)){
                    break;
                }else{
                    w = lc + w;
                    w = w + rc;
                }
            }
            if(w.length()>1)
                System.out.println(w);
        }
    }
}
