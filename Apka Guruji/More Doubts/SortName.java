/* Write a program to display this.
   Input : Mohandas Karamchand Gandhi
   Output : M. K. Gandhi. */
import java.util.*;
public class SortName
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String name;
        int iofs,ioss;
        String fname,mname,lname,sname;
        System.out.println("Enter the full name : ");
        name = sc.nextLine();
        iofs = name.indexOf(' ');
        ioss = name.lastIndexOf(' ');
        fname = name.substring(0,iofs);
        mname = name.substring(iofs+1,ioss);
        lname = name.substring(ioss+1);
        sname = fname.charAt(0)+". "+mname.charAt(0)+". "+lname;
        System.out.println("Sort Name is : "+sname);
    }
}
