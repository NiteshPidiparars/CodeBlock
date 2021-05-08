import java.util.*;
class Frequency
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s;
        char ch,cs;
        int i,l,c;
        System.out.println("Enter the string: ");
        s=sc.nextLine();
        s=s+" ";
        l=s.length();
        System.out.println("char\tFreq");
        System.out.println("================");
        for(cs='a';cs<='z';cs++){
            c=0;
            for(i=0;i<l;i++){
                ch=s.charAt(i);
                if(ch==cs){
                    c++;
                }
            }
            if(c!=0){
                System.out.println(cs+"\t"+c);
            }
        }
    }
}
