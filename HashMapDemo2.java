import java.util.*;
import java.util.Iterator;
class HashMapDemo2
{
    public static void main(String[]args)
    {
        Map<String,Integer> hm=new HashMap<String,Integer>();
        hm.put("a",new Integer(100));
        hm.put("b",new Integer(200));
        hm.put("c",new Integer(300));
        hm.put("d",new Integer(400));
        System.out.println(hm);
        Set<Map.Entry<String,Integer>>st=hm.entrySet();
        for(Map.Entry<String,Integer>me:st)
        {
            System.out.print(me.getKey()+":");
            System.out.println(me.getValue()+" ");
        }
        Map<String,Integer> hp=new HashMap<String,Integer>();
        hp.putAll(hm);
        hp.put("e",new Integer(500));
        hp.put("f",new Integer(600));
        hp.put("g",new Integer(700));
        hp.put("h",new Integer(800));
        System.out.println(hp);
       // for(Map.Entry<String,Integer>me1: hp.entrySet()){
            //System.out.println(me1.getKey()+" : "+me1.getValue()+" : ");}
        //for(String name: hp.keySet()){
        //    System.out.println("Keys is: "+name);}
       //for(Integer values: hp.values()){
         //   System.out.println("Values is: "+values);}
         //Iterator<Map.Entry<String,Integer>>itr=hp.entrySet().iterator();
        // while(itr.hasNext()){
           // Map.Entry<String,Integer>entry=itr.next();
            //System.out.println("Keys is: "+entry.getKey()+" and Value is: "+entry.getValue());}
            //hp.forEach((k,v)-> System.out.println("Keys is: "+k+", Values is: "+v));
            for(String name: hp.keySet()){
                String url=hp.get(name);
                System.out.println("Key is: "+name+", value is : "+url);
            }
    }
}
