import java.util.*;
public class VowelString
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        int c=0;
        for(int i=0;i<str.length();i++){
            if((str.toLowerCase().charAt(i)=='a')||
               (str.toLowerCase().charAt(i)=='e')||
               (str.toLowerCase().charAt(i)=='i')||
               (str.toLowerCase().charAt(i)=='o')||
               (str.toLowerCase().charAt(i)=='u')){
                c++;
               }
        }
        System.out.println("Number of Vowel in: "+str+":"+c);
    }
}
