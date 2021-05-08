import java.util.*;
public class AnagramExample
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String str,r="";
        int i,l,ns=0;
        char ch;
        System.out.println("Enter the Words : ");
        str = sc.nextLine();
        l = str.length();
        for(i=0;i<l;i++){
            ch = str.charAt(i);
            if(ch == ' '){
                ns++;
                r = ch.length();
                }
        }
        if(r.equalsIgnoreCase(str))
            System.out.println("String are anagram");
        System.out.println("Number of Words : "+(ns+1));
    }
}
