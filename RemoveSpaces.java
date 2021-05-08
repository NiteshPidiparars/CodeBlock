import java.util.*;
class RemoveSpaces
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s,w="";
        int i,l;
        char ch;
        System.out.println("Enter the string: ");
        s=sc.nextLine();
        s=s+" ";
        l=s.length();
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            if(ch!=' '){
                w=w+ch;

           }
        }
        System.out.println(w+" ");
    }
}
