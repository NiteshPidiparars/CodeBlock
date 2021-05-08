import java.util.*;
import java.util.Vector;
public class VectorSubRange
{
    public static void main(String[]args)
    {
        Vector<String>v=new Vector<String>();
        v.add("One");
        v.add("Two");
        v.add("Three");
        v.add("Random");
        System.out.println("Actual Vector : "+v);
        List<String>list=v.subList(2,4);
        System.out.println("SubList :"+list);
    }
}

