import java.util.*;
class TitleCase
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s,w="";
        int i,l;
        char ch;
        System.out.println("Enter the String: ");
        s=sc.nextLine();
        s=s+" ";
        l=s.length();
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            if(ch!=' '){
                w=w+ch;
        }
        else
        {
            w=Character.toUpperCase(w.charAt(0))+w.substring(1);
            System.out.print(w+" ");
        w="";
          }
        }
    }
}
