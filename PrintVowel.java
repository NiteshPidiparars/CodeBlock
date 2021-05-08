import java.util.*;
class PrintVowel
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,l;
        char ch;
        System.out.println("Enter the string: ");
        s=sc.nextLine();
        s=s+" ";
        l=s.length();
        System.out.println("Vowel are: ");
        for(i=0;i<l;i++){
            ch=Character.toLowerCase(s.charAt(i));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                System.out.println(ch);
        }
    }
}
