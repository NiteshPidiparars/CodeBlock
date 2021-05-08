import java.util.ArrayList;
import java.util.Iterator;
class NKList
{
    public static void main(String[]args)
    {
        ArrayList<String> l1=new ArrayList<String>();
        l1.add("Rahul");
        l1.add("Ajay");
        l1.add("Ramesh");
        l1.add("Richa");
        System.out.println("ArrayList:"+l1);
        Iterator itr=l1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");
        }
    }
}

