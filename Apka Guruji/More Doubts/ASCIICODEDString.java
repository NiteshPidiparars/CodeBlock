/* Write a Java program to enter any sentence and
   convert by adding six to the total of ASCII code
   of characters. Print the statement into a coded message.
   Sample Input : RAJ IS A GOOD BOY
   Output : XGP OY G MUUJ HUE*/
import java.util.*;
public class ASCIICODEDString
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s,rs="";
        int l,i;
        char ch;
        System.out.println("Enter the sentence : ");
        s = sc.nextLine();
        l = s.length();
        for(i=0;i<l;i++){
            ch = s.charAt(i);
            if(!Character.isWhitespace(ch)){
                ch += 6;
                if(ch>122)
                    ch -= 26;
                else if(ch>90 && ch<97)
                    ch -= 26;
            }
            rs += ch;
        }
        System.out.println("Result is : "+rs);
    }
}
