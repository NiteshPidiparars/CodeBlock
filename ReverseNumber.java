import java.util.*;
class ReverseNumber
{
    public static void main(String[]args)
    {
        int rev=0,n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        sc.close();
        while(n!=0)
        {
            int temp=n%10;
                rev=(rev*10)+temp;
                n=n/10;
        }
        System.out.println("Reverse are: "+rev);
    }
}
