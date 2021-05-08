import java.util.*;
class Palindrome
{
    public static void main(String[]args)
    {
        int number=0;
        int numCopy=0;
        int reverse=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        number=sc.nextInt();
        numCopy=number;
        while(numCopy>0)
        {
            int digits=numCopy%10;
            reverse=(reverse*10)+digits;
            numCopy=numCopy/10;
        }
        if(number==reverse)
            System.out.println(number+" is a palindrome");
        else
            System.out.println(number+" is not palindrome");
    }
}
