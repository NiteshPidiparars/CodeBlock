import java.util.*;
class SingleStringSort
{
    public static void main(String[]args)
    {
        String str="dcba";
        char[]ch=str.toCharArray();
        Arrays.sort(ch);
        String sorted=new String(ch);
        System.out.println("Pre-sorted string: "+str);
        System.out.println("sorted string: "+sorted);
    }
}
