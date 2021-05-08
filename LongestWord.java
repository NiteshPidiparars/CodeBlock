import java.util.*;
class LongestWord
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s=sc.nextLine();
        String maxword=null;
        s=s+" ";
        int i,l;
        l=s.length();
        int maxlength=0;
        String word="";
        for(i=0;i<l;i++){
            word=word+s.charAt(i);
            if(s.charAt(i+1)==' '){
            if(word.length()>maxlength){
                maxword=new String(word);
                maxlength=word.length();
            }
            word="";
            i++;
            }
        }
        System.out.println("Longest Words are: "+maxword);
    }
}


