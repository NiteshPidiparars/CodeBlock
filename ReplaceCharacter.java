import java.util.*;
public class ReplaceCharacter
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s,r;
        System.out.println("Enter the String: ");
        s=sc.nextLine();
        r=s.replace('e','*');
        System.out.println("New String is : "+r);
    }
}

