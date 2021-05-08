import java.util.*;
class Piglatin1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s,lp,rp,fs;
        int i,l;
        char ch;
        System.out.println("Enter the String: ");
        s=sc.nextLine();
        s=s.toUpperCase();
        l=s.length();
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                break;
            }
        }
            lp=s.substring(0,i);
            rp=s.substring(i);
            fs=rp+lp+"AY";
            System.out.println("Piglatin String are: "+fs);
    }
}
