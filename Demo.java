import java.util.*;
public class Demo
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        System.out.println("Enter the char: ");
        char c=sc.next(".").charAt(0);
        int count=0;
        char strarr[]=str.toCharArray();
        for(int i=0;i<strarr.length;i++){
            if(strarr[i]==c){
                count++;
            }
        }
        System.out.println("Number of char occur found:\n "+count);
    }
}
