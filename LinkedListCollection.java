import java.util.*;
class LinkedListCollection
{
    public static void main(String[]args)
    {
        LinkedList l=new LinkedList();
        l.add(" C");
        l.add(" C++");
        l.add(" JAVA");
        l.add(" Python");
        System.out.println("Linked List is: "+l);
        ListIterator lit=l.listIterator();
        while(lit.hasPrevious()){
            String s=(String)lit.previous();
            if(s.equals(" C"))
               lit.set(" DS");
        }
        System.out.println(l);
    }
}
