public class HtmlTagRemover
{
    public static void main(String[]args)
    {
        String text="<p>this tags is going to disappear.</p>";
        System.out.println(text);
        text=text.replaceAll("\\<.*?//","");
        System.out.println(text);
    }
}
