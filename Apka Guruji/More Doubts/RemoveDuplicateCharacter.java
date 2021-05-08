/* WAP to remove all duplicate characters from a given input sentence
   (The second or further occurrence of duplicate characters should be
    removed.)
    Input : Java is just fun.
    Output : Jav is ut fn. */
import java.util.*;
public class RemoveDuplicateCharacter
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s,rs="";
        int i,l;
        char ch,nch;
        System.out.println("Enter a String/Sentences : ");
        s = sc.nextLine();
        l = s.length();
        for(i=0;i<l;i++){
            ch = s.charAt(i);
            if(ch==' '){
                rs += ch;
            }else{
                if(rs.indexOf(ch)==-1){
                    if(Character.isLetter(ch)){
                        if(Character.isUpperCase(ch))
                            nch = Character.toLowerCase(ch);
                        else
                            nch = Character.toUpperCase(ch);
                        if(rs.indexOf(nch)==-1)
                            rs += ch;
                    }else
                    rs += ch;
                }
            }
        }
        System.out.println("Resulting String is : "+rs);
    }
}
