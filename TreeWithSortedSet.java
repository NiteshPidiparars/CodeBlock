import java.util.TreeSet;
import java.util.Iterator;
class TreeWithSortedSet
{
    public static void main(String[]args)
    {
        TreeSet t1=new TreeSet();
        t1.add(" E");
        t1.add(" F");
        t1.add(" G");
        t1.add(" H");
        System.out.println(t1);
        System.out.println(t1.first());
        System.out.println(t1.last());
        System.out.println(t1.headSet(" F"));
        System.out.println(t1.tailSet(" F"));
        System.out.println(t1.subSet(" F"," G"));
        System.out.println(t1.comparator());
        Iterator it=t1.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        TreeSet t=new TreeSet(t1);
        t.add(" A");
        t.add(" B");
        t.add(" C");
        t.add(" D");
        Object[] a=t.toArray();
        System.out.println(" Array: ");
        for(Object object : a){
            System.out.print(object+" ");
        }
        System.out.println();
        System.out.println(t);
    }
}
