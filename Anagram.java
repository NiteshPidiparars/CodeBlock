import java.util.*;
class Anagram
{
    public static void main(String[]args)
    {
        Anagram a=new Anagram();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1=sc.readLine();
        System.out.println("Enter the second string: ");
        String str2=sc.readLine();
        int l=a.Anagram(str1,str2);
        if(l==0)
        {
            System.out.println("Result: "+str1+" and "+str1+" are anagram");
        }
        else
        {
            System.out.println("Result: "+str1+" and "+str1+" are not anagram");
        }
        System.out.println();
    }
    public int Anagram(String str1,String str2)
    {
        if(str1.equals(str2)){
            return 0;
    }
    return 1;
    }
}
