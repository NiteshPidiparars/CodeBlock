import java.util.*;
class StringTokenizerExample
{
    public static void main(String[]args)
    {
        StringTokenizer st=new StringTokenizer("Java String Example");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
