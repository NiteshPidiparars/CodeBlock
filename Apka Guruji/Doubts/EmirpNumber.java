/*
    An EMIRP NUMBER is a number which is prime backwards and forwards.
    Example: 13 and 31 are both prime number. Thus, 13 is an EMIRP NUMBER.
    Class Name : EMIRP
    Data members/instance variables:
            n: stores the number
            rev: stores the revers of the number
            f: stores the divisor
    Member Functions :
    EMIRP(int NN): to assign n=NN,rev=0 and f=2
    int IsPrime(int x): check the number IsPrime using the recursive technique and return 1 if prime otherwise 0
    void isEmpty(): reverse the given number and check if both the original number and the reverse number are prime, by invoking the function IsPrime(int) and display the result with an appropriate message.

    Specific the class EMIRP giving details of the constructor(int),
    int IsPrime(int) and void isEmpty(), Define the main() function to
    create an object and call the methods to check the EMIRP number.
*/
import java.util.*;
public class EmirpNumber
{
    private int n,rev,f;
    public EmirpNumber(int nn)
    {
        n = nn;
        rev = 0;
        f = 2;
    }
    private int isPrime(int x)
    {
        if(x == 1)
            return 0;
        else if(f == x){
            f = 2;
            return 1;
        }
        else if(x%f == 0){
            f = 2;
            return 0;
        }else{
            f++;
            return isPrime(x);
        }
    }
    public void isEmirp()
    {
        int rev=0,div;
        for(div=n;div>0;div=div/10)
            rev = rev*10 + (div%10);
        if(isPrime(rev)==1 && isPrime(n)==1)
            System.out.println("It is an Emirp Number.");
        else
            System.out.println("It is not Emirp Number.");
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        EmirpNumber ob = new EmirpNumber(n);
        ob.isEmirp();
    }
}

