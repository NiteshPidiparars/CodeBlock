import java.util.*;
import java.util.Iterator;
class PriorityQueueTest
{
    public static void main(String[]args)
    {
        PriorityQueue<String> pq=new PriorityQueue<String>();
        pq.add(" Java");
        pq.add(" Android");
        pq.add(" PHP");
        pq.add(" C++");
        pq.add(" CSS");
        pq.add(" JavaScript");
        pq.add(" Python");
        pq.add(" Ajax");
        System.out.println(pq+" ");
        pq.offer(" Jquery");
        System.out.println(pq+" ");
        Iterator it=pq.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println(" Head: "+pq.element());
        System.out.println(" Head: "+pq.peek());
        pq.remove();
        pq.poll();
        pq.remove(" CSS");
        System.out.println("Queue After removing and polling Operations: "+pq);
        System.out.println("Is Python is Present: "+pq.contains(" Python"));
        Object a[]=pq.toArray();
        System.out.println("Array: ");
        for(Object object:a){
            System.out.print(object+" ");
        }
        System.out.println();
        pq.clear();
        System.out.println(pq+" Queue Size: "+pq.size());
    }
}
