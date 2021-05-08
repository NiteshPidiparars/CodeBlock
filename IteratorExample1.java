import java.util.ArrayList;
import java.util.Iterator;
class IteratorExample1
{
    public static void main(String[]args)
    {
        ArrayList al=new ArrayList();
        for(int i=0;i<10;i++)
            al.add(i);
        System.out.println("Array List: "+al);
        Iterator it=al.iterator();
        while(it.hasNext()){
            Integer I=(int)it.next();
            if(I%2==0)
                System.out.println(I);
                else
                it.remove();
        }
            System.out.println(al);
    }
}
