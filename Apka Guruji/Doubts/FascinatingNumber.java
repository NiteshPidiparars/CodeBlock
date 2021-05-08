/*
    Write a program to Java to input a number and check whether
    it is a Fascinating number or not.
    Fascinating Number: Some number of 3 digits or more exhibits
    a very interesting property.the property is such that when the
    number is multiplied by 2 and 3, and both these products are
    concatenated with the original number. all digits from 1 to 9
    are present execute once,regardless of the number of zeros.
    Example : 192
            192 * 1 = 192
            192 * 2 = 384
            192 * 3 = 576
            Concatenating the result : 192384576
    It could be observed that 192384576 consists of all digits from
    1 to 9 exactly once. Hence it could be concluded that 192 is a Fascinating Number.

    Some examples of Fascinating Number are : 192,219,273,327,1902,1920,2019 etc.
*/
import java.util.*;
public class FascinatingNumber
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        if(isFacinating(n))
            System.out.println("It is Fascinating.");
        else
            System.out.println("It is not Fascinating.");
    }
    public static boolean isFacinating(int n)
    {
        String s = "" + n + n*2 + n*3;
        System.out.println("The Number After Concatenating : "+s);
        int i,l,c=0;
        char ch,cs;
        l = s.length();
        for(cs='1';cs<='9';cs++){
            c=0;
            for(i=0;i<l;i++){
                ch = s.charAt(i);
                if(ch == cs)
                    c++;
            }
            if(c!=1)
                break;
        }
        if(cs > '9')
            return true;
        else
            return false;
    }
}
