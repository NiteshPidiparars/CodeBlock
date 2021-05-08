import java.util.*;
class CountWords1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,l,ns=0;
        char ch;
        System.out.println("Enter the string: ");
        s=sc.nextLine();
        s=s+" ";
        l=s.length();
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            if(ch==' '){
                ns++;
            }
        }
        System.out.println("Count words are: "+ns);
    }
}
