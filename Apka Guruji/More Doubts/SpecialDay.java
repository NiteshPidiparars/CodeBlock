/* Consider the following statement :-
   "January 26 is celebrated as the Republic Day of India".
   Write a program to change 26 to 15, January to August, Republic
   to Independence and finally print "August 15 is celebrated as the
   Independence Day of India. */
import java.util.*;
public class SpecialDay
{
    public static void main(String[]args)
    {
        String s = "January 26 is celebrated as the Republic Day of India";
        String rs = s.replace("26","15").replace("January","August")
                    .replace("Republic","Independence");
        System.out.println(rs);
    }
}
