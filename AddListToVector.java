import java.util.Vector;
import java.util.*;
import java.util.ArrayList;
public class AddListToVector
{
    public static void main(String[]args)
    {
        Vector<String>v=new Vector<String>();
        v.add("One");
        v.add("Two");
        v.add("Three");
        v.add("Random");
        System.out.println("Actual Vector: "+v);
        List list=new ArrayList();
        list.add("First");
        list.add("Second");
        v.addAll(list);
        System.out.println("After Copy: "+v);
    }
}
