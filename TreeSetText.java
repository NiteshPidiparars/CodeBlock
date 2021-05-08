import java.util.TreeSet;
import java.util.Iterator;
class TreeSetText
{
    public static void main(String[]args)
    {
        TreeSet t=new TreeSet();
        t.add(" Java");
        t.add(" Android");
        t.add(" PHP");
        t.add(" CSS");
        System.out.println(t);
        Iterator it=t.iterator();
        while(it.hasNext()){
            String s=(String)it.next();
            System.out.println(s+" ");
        }
        for(Object object : t){
            System.out.print(object+" ");
        }
    }
}
