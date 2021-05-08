import java.util.*;
class Ss
{
    public static void main(String[]args)
    {
        TreeSet t=new TreeSet();
        t.add("1");
        t.add("2");
        t.add("3");
        t.add("4");
        System.out.println(t);
        System.out.println(t.headSet("3"));
        System.out.println(t.tailSet("3"));
        System.out.println(t.subSet("3","4"));
        System.out.println(t.comparator());
    }
}
