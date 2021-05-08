import java.util.*;
class RepeatingCharacter
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s,r=" ";
        int i,l;
        char ch,pch;
        System.out.println("Enter the string: ");
        s=sc.nextLine();
        l=s.length();
        s=s+" ";
        r=r+s.charAt(0);
        System.out.println("After Replacements Character is: ");
        for(i=1;i<l;i++){
            ch=s.charAt(i);
            pch=s.charAt(i-1);
            if(pch==ch)
                r=r+"*";
            else
                r=r+ch;
        }
        System.out.println(r);
    }
}
