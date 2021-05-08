import java.util.*;
public class StringConcat
{
    public static void main(String[]args)
    {
        String s1="Hello";
        String s2=" Hy";
        String s3=s1.concat(s2);
        System.out.println("s1= "+s1);
        System.out.println("s2= "+s2);
        System.out.println("s3= "+s3);
        String s4="Good";
        if(s4.equals(s1))
        {
            System.out.println("s4 is equal to s1");
        }
        else
        {
            System.out.println("s4 is not equals to s1");
        }
    }
}
