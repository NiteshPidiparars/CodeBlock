import java.util.*;
class PalindromeString
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s,r="";
        char ch,cs;
        int i,l,c;
        System.out.println("Enter the string: ");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++){
            ch=s.charAt(i);
                r=ch+r;
        }
        if(r.equalsIgnoreCase(s)){
                System.out.println("its PalindromeString.");
        }
        else{
            System.out.println("its not PalindromeString.");
        }
    }
}
