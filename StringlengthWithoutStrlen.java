import java.util.Scanner;
class StringlengthWithoutStrlen
{
    static int i,c,res;
    static int length(String s)
    {
        try
        {
            for(i=0,c=0;0<=i;i++,c++){
                s.charAt(i);
            }
        }
        catch(Exception e){
        System.out.println("Length is: ");
        }
        return c;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        res=StringlengthWithoutStrlen.length(str);
        System.out.println(res);
    }
}
