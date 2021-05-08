import java.util.*;
class CompairString
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1=sc.nextLine();
        System.out.println("Enter second string: ");
        String s2=sc.nextLine();
        if(s1.compareTo(s2)>0)
            System.out.println("S1 is greater to S2");
        else if(s1.compareTo(s2)<0)
            System.out.println("S1 is smaller to S2");
            else
                System.out.println("S1 is equal to S2");
    }
}
