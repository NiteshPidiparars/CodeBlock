import java.util.*;
class ManIsMortalPettern
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s,w="";
        int i,j,l,sp=0;
        char ch;
        System.out.println("Enter the string: ");
        s=sc.nextLine();
        s=s+" ";
        l=s.length();
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            if(ch!=' ')
                w=w+ch;
            else
            {
                for(j=0;j<sp;j++)
                    System.out.print(" ");
                System.out.println(w);
                sp=sp+w.length();
                w=" ";
            }
        }
    }
}
