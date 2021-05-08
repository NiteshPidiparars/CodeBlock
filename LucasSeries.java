import java.util.*;
class LucasSeries
{
    public static void main(String[]args)
    {
        int limit,n1,n2,add;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        limit=sc.nextInt();
        n1=2;
        n2=1;
        System.out.println("Lucas Series is: ");
        while(limit>=n1){
        System.out.println(n1+"");
            add=n1+n2;
            n1=n2;
            n2=add;
        }
    }
}
