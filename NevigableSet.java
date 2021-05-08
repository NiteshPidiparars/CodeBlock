import java.util.TreeSet;
import java.util.*;
class NevigableSet
{
    public static void main(String[]args)
    {
        TreeSet t=new TreeSet();
        t.add(" A");
        t.add(" C");
        t.add(" D");
        t.add(" B");
        System.out.println(t);
        System.out.println(t.ceiling(" C"));
        System.out.println(t.floor(" C"));
        System.out.println(t.first());
        System.out.println(t.last());
        System.out.println(t.descendingSet());
        System.out.println(t.pollFirst());
        System.out.println(t.pollLast());
        System.out.println(t.higher(" C"));
        System.out.println(t.lower(" C"));
        Iterator it=t.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
        System.out.println(t.subSet(" B"," C"));
        System.out.println(t.subSet(" B",true," C",true));
        System.out.println(t.tailSet(" C"));
        System.out.println(t.tailSet(" C",true));
        t.remove(" C");
        System.out.println("Size of treeSet After Remove C: "+t);
        t.clear();
        System.out.println(t+" "+" Is treeSet Empty: "+t.isEmpty());
    }
}
