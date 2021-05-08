import java.util.LinkedList;
import java.util.ListIterator;
class Lit
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
            System.out.println(lit.nextIndex());
            System.out.println("Previous index is: "+lit.previousIndex());
        }
        System.out.println(l);
        while(lit.hasPrevious()){
                String s1=(String)lit.previous();
        if(s1.equals(" Kotlin"))
             lit.set("NIK");
        else if(s1.equals("PHP"))
            lit.remove();
            System.out.println("Next Index is: "+lit.previousIndex());
            System.out.println(lit.previousIndex());
        }
           System.out.println(l);
           System.out.println(lit.previousIndex());
    }
}

