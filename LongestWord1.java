import java.util.*;
class LongestWord1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s,w="",lw="";
        int i,l;
        char ch;
        System.out.println("Enter the String: ");
        s=sc.nextLine();
        s=s+"";
        l=s.length();
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            if(ch!=' '){
                w=w+ch;
        }
        else{
            if(w.length()>lw.length()){
                lw=w;
            }
            w="";
           }
        }
        System.out.println("Longest word are: "+lw);
    }
}
