import java.util.*;
class LinkedCollection
{
    public static void main(String[]args)
    {
        LinkedList list=new LinkedList();
        list.addFirst("N");
        list.addLast("K");
        list.clone();
        list.add(1,"A");
        list.add(2,"B");
        list.contains(4);
        list.element();
        list.indexOf(2);
        list.lastIndexOf(2);
        list.offer("F");
        list.offerFirst("E");
        list.offerLast("G");
        list.poll();
        list.pollFirst();
        list.pollLast();
        list.pop();
        list.remove();
        list.removeLastOccurrence(5);
        list.removeFirstOccurrence(1);
        list.clear();
        System.out.println(list.removeFirstOccurrence(1));
        System.out.println(list.removeLastOccurrence(5));
        System.out.println(list.remove());
        System.out.println(list.pop());
        System.out.println(list.pollLast());
        System.out.println(list.pollFirst());
        System.out.println(list.poll());
        System.out.println(list.offerFirst("E"));
        System.out.println(list.offerLast("G"));
        System.out.println(list.offer("F"));
        System.out.println(list.lastIndexOf(2));
        System.out.println(list.indexOf(2));
        System.out.println(list.element());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.clone());
        System.out.println(list.contains(4));
        Iterator it=list.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
        ListIterator li=list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
    }
}
