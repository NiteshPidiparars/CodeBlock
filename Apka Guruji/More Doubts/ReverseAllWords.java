/* write a program in Java to accept a string. display the new string
   after reversing each word of the string.
   Sample Input : New Delhi is the capital of India.
   Sample Output : weN ihleD si eht latipac fo aidnL. */
import java.util.*;
public class ReverseAllWords
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s,w="",rs="";
        char ch;
        int i,l;
        System.out.println("Enter the sentence : ");
        s = sc.nextLine();
        s = s + " ";
        l = s.length();
        for(i=0;i<l;i++){
            ch = s.charAt(i);
            if(ch!=' ')
                w=ch+w;
            else{
                rs = rs + " " + w;
                w="";
            }
        }
        System.out.println("Result is : "+rs.substring(1));
    }
}
