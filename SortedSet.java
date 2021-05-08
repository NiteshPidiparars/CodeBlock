import java.util.TreeSet;
class SortedSet
{
    public static void main(String[]args)
    {
        TreeSet t=new TreeSet();
        t.add(" A");
        t.add(" C");
        t.add(" D");
        t.add(" B");
        System.out.println(t);
        System.out.println(t.first());
        System.out.println(t.last());
        System.out.println(t.headSet(" C"));
        System.out.println(t.tailSet(" C"));
        System.out.println(t.subSet(" B"," C"));
        System.out.println(t.comparator());
    }
}
