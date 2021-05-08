import java.util.*;
class NthWord
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s,w=" ";
        char ch;
        int i,l,wn,n;
        System.out.println("Enter the String: ");
        s=sc.nextLine();
        s=s+" ";
        l=s.length();
        wn=0;
        System.out.println("Enter the value of n: ");
        n=sc.nextInt();
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            if(ch!=' ')
                w=w+ch;
                else{
                    wn++;
                    if(n==wn){
                        System.out.println("Resultant is: "+w);
                        break;
                    }
                    w=" ";
            }
        }
    }
}
