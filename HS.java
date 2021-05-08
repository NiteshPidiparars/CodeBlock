import java.util.HashSet;
import java.util.Iterator;
class HS
{
    public static void main(String[]args)
    {
        HashSet hs=new HashSet(4);
        hs.add(" One");
        hs.add(" Two");
        hs.add(" Three");
        hs.add(" Four");
        hs.add(" 10");
        System.out.println(hs);
        Iterator lit=hs.iterator();
        while(lit.hasNext()){
                String s=(String)lit.next();
            System.out.println(s);
        }
        for(Object object: hs){
            System.out.println(object+"");
        }
    }
}

