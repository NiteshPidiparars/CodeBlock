import java.util.*;
import java.util.Vector;
public class VectorEnumeration
{
    public static void main(String[]args)
    {
        Vector<String>v=new Vector<String>();
        v.add("One");
        v.add("Two");
        v.add("Three");
        v.add("Random");
        System.out.println("Actual Vector : "+v);
        Enumeration<String> enm=v.elements();
        while(enm.hasMoreElements()){
            System.out.println(enm.nextElement());
        }
    }
}

