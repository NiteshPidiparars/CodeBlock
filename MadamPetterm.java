import java.util.*;
class MadamPetterm
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,j,l;
        char ch;
        System.out.println("Enter the string: ");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++){
            for(j=0;j<=i;j++){
                System.out.print(s.charAt(j));
                for(j=l-i-1;j<l;j++)
                    System.out.print(s.charAt(j));
                System.out.println();
            }
        }
    }
}
