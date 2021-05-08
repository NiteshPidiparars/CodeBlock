/* Write a Java program to accept any number 'n' that has even number
   of digits to create a new number 'n2' from 'n' such that
   each pair of digits from left side are reversed. in case 'n' has
   odd number of digits then 'n2' is equal to n.
   First Example :
        Input(n) = 427158 Output(n2) = 241785
   Second Example :
        Input(n) = 123  Output(n2) = 123 */
import java.util.*;
public class ReverseDigitPair
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n1,n2=0,div,digits,ld,rd,nd=0,rev;
        System.out.println("Enter the number : ");
        n1 = sc.nextInt();
        for(div=n1;div>0;nd++,div=div/10);
        if(nd%2==1)
            n2 = n1;
        else{
            div = n1;
            while(div>0){
                nd -= 2;
                digits = div/(int)Math.pow(10,nd);
                ld = digits/10;
                rd = digits%10;
                rev = (rd*10 + ld);
                n2 = n2 * 100 + rev;
                div = div%(int)Math.pow(10,nd);
            }
        }
        System.out.println("Result is : "+n2);
    }
}
