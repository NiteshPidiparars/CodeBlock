import java.util.Vector;
public class VectorDemo
{
    public static void main(String[]args)
    {
        Vector v=new Vector();
        v.addElement(" One ");
        v.addElement("Two");
        v.addElement("Three");
        v.remove("Two");
        Vector v1=new Vector();
        v1.addElement("One");
        v1.addElement("Two");
        v1.addElement("Five");
        v.trimToSize();
        v.setSize(12);
        v.setElementAt("Six",1);
        System.out.println("Vector is: "+v);
        System.out.println(v.size());
        System.out.println(" String equivalent of vector: " + v.toString());
        System.out.println("Capacity after trimming: "+v.capacity());
        System.out.println(v.firstElement());
        Object[] a=v.toArray();
        System.out.print("Array: ");
        for(Object object: a){
            System.out.print(object+" ");
        }
        System.out.println();
        if(v.equals(v1))
           System.out.println("Both are equals");
        v.ensureCapacity(22);
        System.out.println("Minimum capacity: " + v.capacity());
        System.out.println(v.remove("Two"));
        v.removeAllElements();
        System.out.println(v.size());

    }
}
