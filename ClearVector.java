import java.util.*;
import java.util.Vector;
public class ClearVector
{
    public static void main(String[]args)
    {
        Vector<String>v=new Vector<String>();
        v.add("One");
        v.add("Two");
        v.add("Three");
        v.add("Random");
        System.out.println("Actual Vector : "+v);
        v.clear();
        System.out.println("After clear vector :"+v);
    }
}
