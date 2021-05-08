import java.util.*;
class ConsicutiveVowel
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,l,c=0;
        char ch1,ch2;
        System.out.println("Enter the string: ");
        s=sc.nextLine().toUpperCase();
        s=s+" ";
        l=s.length();
        System.out.println("The Consicutive Character are: ");
        for(i=1;i<l;i++){
            ch1=s.charAt(i-1);
            ch2=s.charAt(i);
            if(isVowel(ch1)&&isVowel(ch2)){
                System.out.println(" "+ch1+ch2);
            c++;
        }
    }
        System.out.println("Number of such pair: "+c);
    }
    static boolean isVowel(char ch)
    {
        return (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
    }
}
