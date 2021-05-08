/* WAP to input two string and display each string after
   removing common.
   Input : computer, calculator
   Output : mpe,alla */
import java.util.*;
public class CommonCharacters
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        int l1,l2,i,j;
        boolean c1[],c2[];
        char ch1,ch2;
        System.out.println("Enter the first string : ");
        s1 = sc.nextLine();
        System.out.println("Enter the second string : ");
        s2 = sc.nextLine();
        l1 = s1.length();
        l2 = s2.length();
        c1 = new boolean[l1];
        c2 = new boolean[l2];
        for(i=0;i<l1;i++){
            ch1 = s1.charAt(i);
            for(j=0;j<l2;j++){
                ch2 = s2.charAt(j);
                if(ch1 == ch2){
                    c1[i] = true;
                    c2[j] = true;
                }
            }
        }
        System.out.println("Unique characters in first string are : ");
        for(i=0;i<l1;i++)
            if(!c1[i])
                System.out.print(s1.charAt(i));
        System.out.println();
        System.out.println("Unique characters in second string are : ");
        for(i=0;i<l2;i++)
            if(!c2[i])
                System.out.print(s2.charAt(i));
    }
}
