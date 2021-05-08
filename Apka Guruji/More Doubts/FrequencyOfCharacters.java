/* WAP in Java to accept a string and display frequency present in it.
   Input : auiayfeiieouuu
   Output : a = 2
            e = 2
            i = 3
            o = 1
            u = 4 */
import java.util.*;
public class FrequencyOfCharacters
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        char vowels[] = {'a','e','i','o','u'};
        int i,j,l,f;
        System.out.println("Enter the string : ");
        s = sc.nextLine();
        l = s.length();
        for(i=0;i<5;i++){
            f=0;
            for(j=0;j<l;j++){
                if(s.charAt(j) == vowels[i])
                    f++;
            }
            System.out.println(vowels[i]+" = "+f);
        }
    }
/*  public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        char ch,cs;
        int l,i,c;
        System.out.println("Enter the string : ");
        s = sc.nextLine();
        l = s.length();
        System.out.println("Char\tFreq");
        System.out.println("------------");
        for(cs='a';cs<='z';cs++){
            c=0;
            for(i=0;i<l;i++){
                ch = s.charAt(i);
                if(cs == ch){
                    c++;
                }
            }
            if(c!=0){
                System.out.println(cs+"\t"+c);
            }
        }
    } */
}
