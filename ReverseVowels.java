import java.util.*;
class ReverseVowels
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String w,r="";
        char ch;
        int i,l;
        System.out.println("Enter the Sentence: ");
        w=sc.nextLine().toLowerCase();
        l=w.length();
        for(i=0;i<l;i++){
            ch=w.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                ch++;
            r=r+ch;
        }
        System.out.println("Resultant Word is: "+r);
    }
}
