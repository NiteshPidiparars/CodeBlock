import java.util.Vector;
import java.util.*;
import java.util.ArrayList;
public class BestVectorOperation
{
    public static void main(String[]args)
    {
        Vector<String>v=new Vector<String>();
        v.add("One");
        v.add("Two");
        v.add("Three");
        System.out.println(v);
        v.add(2,"Random");
        System.out.println(v);
        System.out.println("Element of index 3 is: "+v.get(3));
        System.out.println("The first element of this vector :"+v.firstElement());
        System.out.println("The Last Element of this vector :"+v.lastElement());
        System.out.println("Is vector Empty : "+v.isEmpty());
    }
}


