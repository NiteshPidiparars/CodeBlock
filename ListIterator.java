import java.util.*;
import java.util.ListIterator;
class ListIterator
{
    public static void main(String[]args)
    {
        LinkedList l=new LinkedList();
        l.add(" C");
        l.add(" Java");
        l.add(" CPP");
        l.add(" Python");
        System.out.println(l);
        ListIterator lit=l.listIterator();
        while(lit.hasNext()){
            String s=(String)lit.next();
        if(s.equals(" Java"))
            lit.set(" Kotlin");
      else if(s.equals(" C"))
            lit.set(" PHP");
      else if(s.equals(" CPP"))
            lit.set(" JP");
        }
        System.out.println(l);
    }
}
