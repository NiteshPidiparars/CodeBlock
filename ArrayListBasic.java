import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
class ArrayListBasic
{
    public static void main(String[]args)
    {
        ArrayList<String>al=new ArrayList<String>();
        al.add(" Java");
        al.add(" C");
        al.add(" PHP");
        al.add(" Python");
        al.add(" CSS");
        al.add(" HTML");
        al.add(1," Android");
        System.out.println("ArrayList: "+al);
        al.remove(4);
        System.out.println("Size of ArrayList After Removing: "+al.size());
        System.out.println("Is Java is want in list: "+al.contains("Java"));
        Object[] a=al.toArray();
        for(Object object:a){
            System.out.println(object+" ");
        }
        al.set(5,"JavaScript");
        System.out.println("ArrayList after Replace: "+al);
        Collections.sort(al);
        System.out.println("ArrayList After sorting: "+al);
        Collections.sort(al, Collections.reverseOrder());
        System.out.println("ArrayList After sorting in descending order: "+al);
        System.out.println("Index of ArrayList: "+al.indexOf("Android"));
        al.clear();
        System.out.println(al+" "+" Is list empty after clear "+al.isEmpty());
    }
}
