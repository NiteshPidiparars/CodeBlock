import java.util.*;
public class ChangeCase
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.println("Enter the character(a-z,A-Z): ");
        ch=sc.next().charAt(0);
        System.out.println("Original character is ;"+ch+" and its ASCII Code "+(int)ch);
        ch+=(ch>=97&&ch<=122)?-32:32;
        System.out.println("New character is ;"+ch+" and its ASCII Code "+(int)ch);
    }
}
