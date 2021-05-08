import java.util.*;
import java.util.Vector;
public class VectorClone
{
    public static void main(String[]args)
    {
        Vector<String>v=new Vector<String>();
        v.add("One");
        v.add("Two");
        v.add("Three");
        v.add("Random");
        System.out.println("Actual Vector : "+v);
        Vector<String>copy=(Vector<String>)v.clone();
        System.out.println("Clone Vector :"+copy);
    }
}
