/* Delete duplicate characters in a string [Without using
   library functions] */
import java.util.*;
public class RemoveDuplicateCharacters
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s,rs="";
        int i,j,l;
        char cs;
        System.out.println("Enter the string : ");
        s = sc.nextLine();
        l = s.length();
        for(i=0;i<l;i++){
            cs = s.charAt(i);
            for(j=i-1;j>=0;j--){
                if(cs == s.charAt(j))
                    break;
            }
            if(j==-1)
                rs += cs;
        }
        System.out.println("Result is : "+rs);
    }
}
