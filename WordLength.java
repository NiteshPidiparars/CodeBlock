import java.util.*;
class WordLength
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
        System.out.println("Word\tLength");
        System.out.println("================");
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            if(ch!=' '){
                w=w+ch;
        }
        else{
            System.out.println(w+"\t"+w.length());
        w="";
          }
        }
    }
}
