import java.util.ArrayList;
import java.util.Iterator;
class ArrayListTest
{
    public static void main(String[]args)
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Java");
        al.add(" C");
        al.add(" C++");
        al.add(" PHP");
        System.out.print("ArrayList: "+al);
        System.out.println();
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+"");
        }
        System.out.println();
        for(String string:al){
            System.out.print(string+"");
        }
    }
}
