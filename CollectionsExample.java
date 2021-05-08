import java.util.*;
import java.util.Vector;
public class CollectionsExample
{
    public static void main(String[]args)
    {
        Vector v=new Vector();
        v.add(20);
        v.add(50);
        v.add(10);
        v.add(30);
        System.out.println(v);
        int x=Collections.binarySearch(v,30);
        Collections.sort(v);
        System.out.println(v);
        Collections.reverse(v);
        System.out.println(v);
        Collections.shuffle(v);
        System.out.println(v);
        Collections.swap(v,1,3);
        System.out.println(v);
        System.out.println(x);
    }
}
