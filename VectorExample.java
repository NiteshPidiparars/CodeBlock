import java.util.*;
import java.util.Vector;
public class VectorExample
{
    public static void main(String[]args)
    {
        int n,i;
        Vector v=new Vector();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Vector: ");
        n=sc.nextInt();
        System.out.println("Enter the Elements in the vector: ");
        for(i=0;i<n;i++){
            v.add(sc.nextInt());
        }
        System.out.println("The Elements are: ");
        for(i=0;i<n;i++){
            System.out.println(v.get(i)+" ");
        }
        System.out.println("Enter the elements to remove: ");
        v.remove(sc.nextInt());
        System.out.println("After removing the remaining elements are in the vector: ");
        for(i=0;i<v.size();i++){
            System.out.print(v.get(i)+" ");
        }
    }
}
