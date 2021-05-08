import java.util.*;
class DeleteUppercase
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s,r;
        int i,l;
        char ch;
        System.out.println("Enter the string: ");
        s=sc.nextLine();
        l=s.length();
        r=" ";
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            if(!Character.isUpperCase(ch))
                r=r+ch;
        }
        System.out.println("Resultant String is: "+r);
    }
}
