import java.util.*;
class TreeSetBasics
{
    public static void main(String[]args){
        TreeSet<Integer> ts=new TreeSet<Integer>();
        ts.add(12);
        ts.add(11);
        ts.add(14);
        ts.add(15);
        ts.add(10);
        ts.add(16);
        ts.add(17);
        System.out.println(ts);
        System.out.println("Ceiling Value: "+ts.ceiling(13));
        System.out.println("Floor Value: "+ts.floor(13));
        System.out.println("First Element: "+ts.first());
        System.out.println("Last Element: "+ts.last());
        System.out.println("Poll fist elements: "+ts.pollFirst());
        System.out.println("Poll last elements: "+ts.pollLast());
        System.out.println("Lower elements of 12: "+ts.lower(12));
        System.out.println("Higher elements of 12: "+ts.higher(12));
        System.out.println("Is 12 is present: "+ts.contains(12));
        Object[] a=ts.toArray();
        System.out.print("Arrays: ");
        for(Object object: a){
            System.out.print(object+" ");
        }
        System.out.println();
        System.out.println("Descending set: "+ts.descendingSet());
        ts.remove(11);
        System.out.println("Size of TreeSet After Removing of 11: "+ts.size());
        ts.clear();
        System.out.println(ts+" "+" Is TreeSet is Empty: "+ts.isEmpty());
    }
}
