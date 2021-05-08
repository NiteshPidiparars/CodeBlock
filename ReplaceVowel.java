import java.util.*;
class ReplaceVowel
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s,w="";
        int i,j,l;
        char ch;
        System.out.println("Enter the String: ");
        s=sc.nextLine().toLowerCase();
        s=s+" ";
        l=s.length();
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            if(ch=='a'||ch=='i'||ch=='o'||ch=='u')
                ch++;
                w+=ch;
        }
        System.out.println("Resultant String are: "+w);
    }
}
