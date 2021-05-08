/* WAP to take a string as input and display the string
   in following pattern.
   Input : man is mortal
   Output : mna si mrtloa
   (First consonant then vowel without changing the sequence) */
import java.util.*;
public class SeparateVowelsConsonants
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s,v="",c="";
        char ch,chl;
        int i,l;
        System.out.println("Enter the sentence : ");
        s = sc.nextLine();
        s = s + " ";
        l = s.length();
        for(i=0;i<l;i++){
            ch = s.charAt(i);
            if(ch!=' '){
                chl = Character.toLowerCase(ch);
                if(chl=='a'||chl=='e'||chl=='i'||chl=='o'||chl=='u')
                    v += ch;
                else
                    c += ch;
            }else{
                System.out.print(c+v+" ");
                v="";
                c="";
            }
        }
    }
}
