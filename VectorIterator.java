import java.util.*;
import java.util.Vector;
public class VectorIterator
{
    public static void main(String[]args)
    {
        Vector<String>v=new Vector<String>();
        v.add("One");
        v.add("Two");
        v.add("Three");
        v.add("Random");
        System.out.println("Actual Vector : "+v);
        Iterator<String> it=v.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

