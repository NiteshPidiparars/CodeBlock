import java.util.*;
class CountWords
{
    public static int CountWords(String str)
    {
        String words[]=str.split(" ");
        int count=words.length;
        return count;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentences: ");
        String sentence=sc.nextLine();
        System.out.println("your sentences has : "+CountWords(sentence)+" words");
    }
}
