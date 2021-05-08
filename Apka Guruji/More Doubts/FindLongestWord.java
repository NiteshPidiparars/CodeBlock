/* WAP in Java to accept a sentence and find the
   longest word starting with a vowel*/
import java.util.*;
public class FindLongestWord
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s,w="",lw="";
        char ch;
        int i,l;
        System.out.println("Enter the sentence : ");
        s = sc.nextLine();
        s = s+" ";
        l = s.length();
        for(i=0;i<l;i++){
            ch = s.charAt(i);
            if(ch!=' ')
                w += ch;
            else{
                ch = w.charAt(0);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    if(w.length() > lw.length())
                        lw = w;
                w="";
            }
        }
        if(lw.length() == 0)
            System.out.println("There is no  word starting with vowel");
        else
            System.out.println("The Word is : "+lw);
    }
}
