/* WAP to accept a phrase and generate its acronym.
   Input : Computer Application Software
   Output : CAS */
import java.util.*;
public class AcronymProgram
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int i,l;
        System.out.println("Enter the string : ");
        s = sc.nextLine();
        System.out.print(s.charAt(0));
        l = s.length();
        for(i=0;i<l;i++){
            if(s.charAt(i) == ' ')
                System.out.print(s.charAt(i+1));
        }
    }
}
