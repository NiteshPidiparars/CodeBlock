/*
    WAP in Java to accept a number and check Smith Number or not.
    (A Smith Number is a composite number for which, in a given base
     (in base 10 by default), the sum of its digits is equals to the
     sum of the digits in its prime factorization).
     For Example : 378 = 2*3*3*3*7 is a Smith Number
            Since  3+7+8 = 2+3+3+3+7
*/
import java.util.*;
public class SmithNumber
{
    private int n;
    public SmithNumber()
    {
        n = 0;
    }
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = sc.nextInt();
    }
    private int sumOfPrimeFactors(int n)
    {
        int s=0;
        for(int x=n,i=2;x>1;i++){
            while(x%i==0){
                s = s+i;
                x = x/i;
            }
        }
        return s;
    }
    private int sumOfDigits(int n)
    {
        int s=0,div,digit;
        for(div=n;div>0;div=div/10){
            digit = div%10;
            s += digit;
        }
        return s;
    }
    public boolean isSmith()
    {
        return sumOfPrimeFactors(n) == sumOfDigits(n);
    }
    public static void main(String[]args)
    {
        SmithNumber obj = new SmithNumber();
        obj.input();
        if(obj.isSmith())
            System.out.println("It is Smith Number.");
        else
            System.out.println("It is not Smith Number.");
    }
}
