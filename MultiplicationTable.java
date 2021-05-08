import java.util.*;
class MultiplicationTable
{
    public static void main(String[]args)
    {
        int n,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        System.out.println("Multiplication of Table "+n+" is ");
        for(c=1;c<=10;c++){
            System.out.println(n+" * "+c+" = "+(n*c));
        }
    }
}
