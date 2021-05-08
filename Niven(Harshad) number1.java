import java.util.*;
class NivenNumber1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n,d,s=0;
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        while(n>0){
            d=n%10;
            s=s+d;
            n=n/10;
        }
        if(n%s==0)
            System.out.println("number is Niven(Harshad) number1");
        else
            System.out.println("number is not Niven(Harshad) number1");
    }
}
