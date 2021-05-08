/* WAP which takes a string as input and delete all the vowels
   from the string.
   Input : My school is the best school.
   Output : My schl s th bst schl. */
import java.util.*;
public class RemoveVowels
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s,rs="";
        int i,l;
        char ch;
        System.out.println("Enter the string : ");
        s = sc.nextLine();
        l = s.length();
        for(i=0;i<l;i++){
            ch = Character.toLowerCase(s.charAt(i));
            if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
                rs += s.charAt(i);
        }
        System.out.println("Resulting String is : "+rs);
    }
}
