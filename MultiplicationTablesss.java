import java.util.*;
class MultiplicationTablesss
{
    public static void main(String[]args)
    {
        int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        a=sc.nextInt();
        b=sc.nextInt();
        for(c=a;c<=b;c++){
            System.out.println("Multiplication Table is: "+c);
            for(d=1;d<=10;d++){
                System.out.println(c+" * "+d+" = "+(c*d));
            }
        }
    }
}
