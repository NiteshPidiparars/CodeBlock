import java.util.*;
public class PalindromeSecntence
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s,w="",arr[]=new String[20];
        int i,l,nw=0;
        char ch;
        System.out.println("Enter the sentence: ");
        s=sc.nextLine();
        s+=" ";
        l=s.length();
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            if(ch!=' ')
                w+=ch;
            else{
                arr[nw++]=w;
                w="";
            }
        }
        for(i=0;i<nw/2;i++){
            if(!arr[i].equalsIgnoreCase(arr[nw-1-i]))
                break;
        }
        if(i==nw/2)
        {
            System.out.println("Palindrome Sentence");
        }
        else{
            System.out.println("Not a Palindrome Sentence");
        }
    }
}
