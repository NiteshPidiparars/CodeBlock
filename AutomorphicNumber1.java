import java.util.*;
class AutomorphicNumber1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String n,s;
        System.out.println("Enter the string: ");
        n=sc.nextLine();
        s=(int)Math.pow(Integer.parseInt(n),2)+"";
        if(n.equals(s.substring(s.length()-n.length())))
            System.out.println("its Automorphic number");
        else
            System.out.println("its not Automorphic number");
    }
};
