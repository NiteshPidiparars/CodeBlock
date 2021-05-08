import java.util.*;
class QueueExample
{
    public static void main(String[]args)
    {
        Queue q=new LinkedList();
        for(int i=1;i<5;i++)
            q.add(i);
            q.offer(" A");
            q.offer(" B");
            q.offer(" C");
            q.offer(" D");
        System.out.println(q);
        System.out.println("tail of queue is: "+q.poll());
        System.out.println("head of queue is: "+q.peek());
        System.out.println("After remove queue is: "+q.remove());
        System.out.println("Size of Queue is: "+q.size());
    }
}
