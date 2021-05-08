/* Write a Java program to accept any sentence and create a
   new sentence by replacing uppercase alphabets by its
   equivalent ASCII value, lowercase alphabets by '@' symbol
   and each non-alphabets by underscore(_) symbol.
   Input : ABC abc D?
   Output : 656667_@@@_68_ */
import java.util.*;
public class StringEncryption
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s,rs="";
        int l,i;
        char ch;
        System.out.println("Enter the String : ");
        s = sc.nextLine();
        l = s.length();
        for(i=0;i<l;i++){
            ch = s.charAt(i);
            if(Character.isUpperCase(ch))
                rs += (int)ch;
            else if(Character.isLowerCase(ch))
                rs += '@';
            else
                rs += '_';
        }
        System.out.println("Resulting String is : "+rs);
    }
}
