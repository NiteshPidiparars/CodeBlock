import java.util.*;
import java.util.Vector;
public class CopyVectorToArray
{
    public static void main(String[]args)
    {
        Vector<String>v=new Vector<String>();
        v.add("One");
        v.add("Two");
        v.add("Three");
        v.add("Random");
        System.out.println("Actual Vector : "+v);
        String[] copyArr=new String[v.size()];
        v.copyInto(copyArr);
        System.out.println("Copied array content: ");
        for(String str: copyArr)
        {
            System.out.println(str);
        }
    }
}
