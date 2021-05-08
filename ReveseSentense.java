import java.util.*;
class ReveseSentense
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s,w=" ",rs=" ";
        int i,l;
        char ch;
        System.out.println("Enter the string: ");
        s=sc.nextLine();
        s=s+" ";
        l=s.length();
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            if(ch!=' ')
                w=w+ch;
            else{
                rs=w+" "+rs;
                w=" ";
            }
        }
        System.out.println("The Resultant String is: "+rs);
    }
}
