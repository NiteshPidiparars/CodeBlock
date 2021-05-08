import java.util.Comparator;
import java.util.TreeSet;
class MyComparator implements Comparator<String>
{
    public int compare(String str1,String str2)
    {
        String first_str;
        String second_str;
        first_str=str1;
        second_str=str2;
        return second_str.compareTo(first_str);
    }
}
class TreeSetDemo
{
    public static void main(String[]args)
    {
        TreeSet<String> t=new TreeSet<String>(new MyComparator());
        t.add(" G");
        t.add(" E");
        t.add(" E");
        t.add(" K");
        t.add(" S");
        t.add(" 4");
        System.out.println("Set before using the comparator: "+t);
        System.out.println("Set in descending order: ");
        for(String element: t)
            System.out.print(element+" ");
    }
}
