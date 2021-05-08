import java.util.*;
class CommanCharacter
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        int i,l1,l2,j;
        char ch,cs;
        System.out.println("Enter the first string: ");
        s1=sc.nextLine();
        System.out.println("Enter the second string: ");
        s2=sc.nextLine();
        l1=s1.length();
        l2=s2.length();
        System.out.println("The Common String are: ");
        for(cs='a';cs<='z';cs++){
            for(i=0;i<l1;i++){
                ch=s1.charAt(i);
                if(cs==ch)
                    break;
            }
             for(j=0;j<l2;j++){
                ch=s2.charAt(j);
                if(cs==ch)
                    break;
             }
             if(i<l1&&j<l2)
                System.out.println(" "+cs);
        }
    }
}
