import java.util.HashSet;
class HashSetBasic
{
    public static void main(String[]args)
    {
        HashSet hs=new HashSet();
        hs.add(" Java");
        hs.add(" Android");
        hs.add(" PHP");
        hs.add(" AJEX");
        System.out.println(hs);
        System.out.println("Is Java added: "+hs.add("Java"));
        hs.remove(" PHP");
        System.out.println("After removing PHP is: "+hs);
        System.out.println("Is Java in list: "+hs.contains(" Java"));
        System.out.println("Size of ArrayList After removing PHP: "+hs.size());
        Object[] a=hs.toArray();
        System.out.println("Array is: ");
        for(Object object :a){
            System.out.print(object+" ");
        }
        System.out.println();
        hs.clear();
        System.out.println(hs+" "+"Is HashSet Empty After clear: "+hs.isEmpty());
    }
}
