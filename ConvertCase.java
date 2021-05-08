import java.util.*;
class ConvertCase
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s,res;
        int i,l;
        char ch;
        System.out.println("Enter the String: ");
        s=sc.nextLine();
        s=s+" ";
        l=s.length();
        res="";
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                ch=Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch))
            {
                ch=Character.toUpperCase(ch);
            }
            res=res+ch;
            }
            System.out.println("Resultant String: "+res);
    }
}
