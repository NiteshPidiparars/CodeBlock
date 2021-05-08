import java.util.*;
public class StringRecursiveReverse
{
    String reverse="";
    public String reverseString(String str)
    {
        if(str.length()==1){
            return str;
        }
        else
        {
            reverse=reverse+str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
    }
    public static void main(String[]args)
    {
       StringRecursiveReverse srr=new StringRecursiveReverse();
       System.out.println("Reverse string: "+srr.reverseString("Java is programming"));
    }
}
