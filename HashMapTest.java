import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
class HashMapTest
{
    public static void main(String[]args)
    {
        HashMap<Integer,String>hm=new HashMap<Integer,String>();
        hm.put(1,"Android");
        hm.put(2,"Java");
        hm.put(3,"PHP");
        hm.put(4,"C++");
        hm.put(5,"JavaScript");
        System.out.println(hm+" ");
        System.out.println();
        Iterator it=hm.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry mapEntry=(Map.Entry)it.next();
            System.out.println("The Key is: "+mapEntry.getKey()+",Value is: "+mapEntry.getValue());
        }
        System.out.println();
        for(Entry<Integer,String>entry:hm.entrySet()){
            System.out.println("Key: "+entry.getKey()+"Value: "+entry.getValue());
        }
        System.out.println();
        for(Object Key: hm.keySet()){
            System.out.println("Key: "+Key.toString()+"Value: "+hm.get(Key));
        }
    }
}
