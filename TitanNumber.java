/*WAP to accept a number and check titan number or not.
(A number is a TitanNumber if the eventual sum(at any stage )of the digits
 of the number obtained after subtracting the square of the
 number from the square of its reverse is a perfect square.)
 For ex-(74)power2=5476 (47)power2=2209 Now, (74)power2-(47)power2=3267
(Sum of digits of result is 18 and its sum of digit is 9 which is a perfect)
*/
import java.util.*;
public class TitanNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,sq,r,sqr,div,rev,diff,s;
        boolean found=false;
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        sq = n*n;
        System.out.println("Square: "+sq);
        for(rev=0,div=n;div>0;rev=rev*10+(div%10),div/=10);//empty short loop for revers
        System.out.println("Reverse is: "+rev);
        sqr = rev*rev;
        System.out.println("Square of reverse: "+sqr);
        diff = Math.abs(sq-sqr);
        System.out.println("Difference : "+diff);
        s = diff;
        do{
            for(div=s,s=0;div>0;div=div/10){
                s+=div%10;
            }
            System.out.println("Sum: "+s);
            if(Math.pow(Math.floor(Math.sqrt(s)),2)==s){
                found = true;
                break;
            }
        }while(s>=10);
        if(found)
            System.out.println("It is titan number.");
        else
            System.out.println("It is not titan number.");
    }
}
