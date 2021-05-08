/* Write a Java programs to encrypt a string by using this technique:
   If character is a vowel then decrease that character by one and if it is
   consonant then increase it by 3. (assume that the string consists of
   alphabets only)
   Input : INDIA IS MY COUNTRY
   Output : HQGHZ HV PB FNTQWUB */
import java.util.*;
public class StringEncryptionSecond
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String st,st1="";
        int i,l;
        char ch;
        System.out.println("Enter the string : ");
        st = sc.nextLine();
        l = st.length();
        for(i=0;i<l;i++){
            ch = Character.toUpperCase(st.charAt(i));
            if(ch!=' '){
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    ch -= 1;
                    if(ch<'A')
                        ch += 26;
                }else{
                    ch += 3;
                    if(ch>'Z')
                        ch -= 26;
                }
        }
        if(Character.isLowerCase(st.charAt(i)))
            ch = Character.toLowerCase(ch);
        st1 += ch;
        }
        System.out.println("Encrypted String : "+st1);
    }
}
