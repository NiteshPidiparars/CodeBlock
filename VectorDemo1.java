import java.util.Vector;
import java.util.Iterator;
public class VectorDemo1
{
    public static void main(String[]args)
    {
        Vector v=new Vector();
        Vector vec=new Vector();
        v.addElement("One");
        v.addElement("Two");
        v.addElement("Three");
        vec.add(5);
        vec.add(3);
        vec.add(2);
        Integer[] a=new Integer[3];
        vec.copyInto(a);
        System.out.println("Element copy are: ");
        for(Integer num: a){
            System.out.println(num);
        }
        v.insertElementAt("Nine",2);
        System.out.println("Capacity of vector: "+v.capacity());
        System.out.println(v);
        System.out.println(v.removeElement("One"));
        System.out.println(v.lastElement());
        System.out.println(v.hashCode());
        System.out.println("Calling retainAll()");
        v.retainAll(vec);
        System.out.println("Numbers after removal :- ");
        Iterator it=vec.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
