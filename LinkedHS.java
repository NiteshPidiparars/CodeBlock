import java.util.LinkedHashSet;
import java.util.Iterator;
class LinkedHS
{
    public static void main(String[]args)
    {
        LinkedHashSet l=new LinkedHashSet();
        l.add("1");
        l.add("2");
        l.add("3");
        l.add("4");
        System.out.println(l);
        Iterator lit=l.iterator();
        while(lit.hasNext()){
         System.out.println(lit.next());
        }
    }
}
