public class FormatString
{
    public static void main(String[]args)
    {
        String str="this is formatted %s Example";
        System.out.println(String.format(str,"string"));
        String str1="we are adding number of %d in string";
        System.out.println(String.format(str1,10));
    }
}
