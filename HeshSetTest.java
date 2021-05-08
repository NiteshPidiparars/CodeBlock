import java.util.*;
class HeshSetTest
{
    public static void main(String[]args)
    {
        HashSet<String>hs=new HashSet<String>();
        hs.add("Java");
        hs.add("Android");
        hs.add("PHP");
        hs.add("Ajax");
        System.out.println(hs);
        Iterator<String>itr=hs.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        for(String string: hs){
            //Enhance for loop
            System.out.print(string+" ");
        }
    }
}
