import java.util.*;
class LastWord
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s,lw;
        System.out.println("Enter the string: ");
        s=sc.nextLine();
        lw=s.substring(s.lastIndexOf(' ')+1);
        System.out.println("The Last Word is: "+lw);
    }
}
