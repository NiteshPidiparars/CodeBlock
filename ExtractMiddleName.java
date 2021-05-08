import java.util.*;
class ExtractMiddleName
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s,mn;
        int iofs,iols;
        System.out.println("Enter the string: ");
        s=sc.nextLine();
        iofs=s.indexOf(' ');
        iols=s.lastIndexOf(' ');
        mn=s.substring(iofs+1,iols);
        System.out.println("The Middle Name is: "+mn);
    }
}
