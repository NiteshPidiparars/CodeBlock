import java.util.*;
class HashMapBasic
{
    public static void main(String[]args)
    {
        HashMap<Integer,String>hm=new HashMap<Integer,String>();
        hm.put(1,"Android");
        hm.put(2,"Java");
        hm.put(3,"PHP");
        hm.put(4,"C++");
        hm.put(5,"JavaScript");
        hm.put(6,"HTML");
        System.out.print(hm+" ");
        System.out.println();
        System.out.println("Value 1 is android: "+hm.containsKey(1));
        System.out.println("Value at 1: "+hm.get(1));
        System.out.println("Java is Present: "+hm.containsValue("Java"));
        hm.remove(2);
        hm.remove(6,"HTML");
        System.out.println("Size After removing Operations: "+hm.size());
        hm.replace(5,"Jquery");
        hm.replace(4,"C++","Scale");
        System.out.println("HashMap After Replace: "+hm);
        hm.clear();
        System.out.println(hm+" Is Map is empty"+hm.isEmpty());
    }
}
