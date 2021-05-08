import java.util.ArrayList;
import java.util.Iterator;
class ArrayList
{
    public static void main(String[]args)
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Rahul");
        al.add("Ajay");
        al.add("Ramesh");
        al.add("Richa");
        System.out.println("ArrayList:"+al);
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+"");
        }
    }
}
