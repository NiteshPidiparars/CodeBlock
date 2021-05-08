import java.util.*;
class Palindrome1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s,w="",rw="";
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
            rw=ch+rw;
        }
        else
        {
            if(w.equalsIgnoreCase(rw)){
                System.out.println(w);
            }
            w="";
            rw="";
          }
        }
    }
}
