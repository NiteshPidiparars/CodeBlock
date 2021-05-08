/* Display following pattern strings :
                c        C
                  o     O
                   m   M
                    p P
                     u
                    T t
                   E   e
                  R      r
                S          s  */
import java.util.*;
public class SpecialXPattern
{
    public static void main(String[]args)
    {
        String s = "computers";
        int l;
        l = s.length();
        int i,j;
        for(i=0;i<l;i++){
            for(j=0;j<l;j++){
                if(i==j){
                    System.out.print(s.charAt(i));
                }else if(i+j == l-1){
                    System.out.print(Character.toUpperCase(s.charAt(i))+" ");
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
