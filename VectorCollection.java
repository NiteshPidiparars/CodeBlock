import java.util.Vector;
import java.util.ArrayList;
import java.util.*;
class VectorCollection
{
    public static void main(String[]args)
    {
        Vector v=new Vector();
        v.addElement("One");
        v.addElement("Two");
        v.addElement("Three");
        v.add(3,"Four");
        v.remove(2);
        v.equals(2);
        System.out.println(v.remove(2));
        System.out.println(v.equals(2));
        System.out.println(v.isEmpty());
        System.out.println(v.lastIndexOf(2));
        //System.out.println(v.isEmpty());
        //v.clear();
        //System.out.println("Vertor is clear");
        System.out.println(v.get(1));
        System.out.println(v.indexOf("Four"));
        v.clone();
        v.ensureCapacity(22);
        System.out.println(v.capacity());
        System.out.println(v);
        System.out.println(v.contains("Five"));
        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            String s=(String)e.nextElement();
            System.out.println(s);
        }

    }
}
