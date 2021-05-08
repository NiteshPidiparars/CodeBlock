import java.util.*;
class PriorityQueueEx
{
    public static void main(String[]args)
    {
        PriorityQueue pq=new PriorityQueue();
        pq.offer(" A");
        pq.offer(" D");
        pq.offer(" C");
        pq.offer(" B");
        PriorityQueue pq1=new PriorityQueue(pq);
        pq.offer(" E");
        pq.offer(" F");
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq1);
    }
}
