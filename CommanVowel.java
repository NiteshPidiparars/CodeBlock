import java.util.*;
class CommanVowel
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String v="aeiou",s1,s2;
        int i,l1,l2,j,k;
        char ch,cs;
        System.out.println("Enter the first string: ");
        s1=sc.nextLine();
        System.out.println("Enter the second string: ");
        s2=sc.nextLine();
        l1=s1.length();
        l2=s2.length();
        System.out.println("The Common String are: ");
        for(i=0;i<5;i++){
                cs=v.charAt(i);
            for(j=0;j<l1;j++){
                ch=s1.charAt(j);
                if(cs==ch)
                    break;
            }
             for(k=0;k<l2;k++){
                ch=s2.charAt(k);
                if(cs==ch)
                    break;
             }
             if(j<l1&&k<l2)
                System.out.println(" "+cs);
        }
    }
}
