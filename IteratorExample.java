import java.util.ArrayList;
import java.util.*;
class IteratorExample
{
    public static void main(String[]args)
    {
        ArrayList al=new ArrayList();
        for(int i=0;i<10;i++)
            al.add(i);
        System.out.println(al);
        Iterator it=al.iterator();
        while(it.hasNext()){
            Integer I=(int)it.next();
            if(I>3 && I<8)
                System.out.println(I);
            else
                it.remove();
        }
            System.out.println(al);
    }
}
