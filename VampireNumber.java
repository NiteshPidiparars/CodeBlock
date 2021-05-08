/* A Vampire number (or true vampire number) is a composite natural
with an even number of digits,that can be factored into two
natural number each with half as many digits as the original number
and not both with trailing zeros where the two factors contain precisely
all the digits of the original number, in any order,counting multiplicity.
the first vampire number is 1260 = 21 * 60.
*/
import java.util.*;
public class VampireNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,nd,min,max;
        int i,f[] = new int[100],nf,j=0;
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        nf = 0;
        for(i=1;i<=n;i++){
            if(n%i==0)
                nf++;
        }
        if(nf==2){
            System.out.println("The number should be composite.");
        }else{
            nd = (n+"").length();
            if(nd%2==1){
                System.out.println("The number should have even number.");
            }else{
                min = (int)Math.pow(10,nd/2-1);
                max = (int)Math.pow(10,nd/2)-1;
                nf=0;
                for(i=min;i<=max;i++){
                    if(n%i==0)
                        f[nf++]=i;
                }
                outerloop:for(i=0;i<nf;i++){
                    for(j=0;j<nf;j++){
                        if(f[i]*f[j]==n){
                            if(!(f[i]%10==0 && f[j]%10==0)){
                                if(digitsMatching(n,f[i],f[j]))
                                    break outerloop;
                            }
                        }
                    }
                }
                if(i==nf)
                    System.out.println("Not vampire number.");
                else
                    System.out.println("It is Vampire number (" +f[i]+"x"+f[j]+")");
            }
        }
    }
    static boolean digitsMatching(int n,int a,int b)
    {
        String s = ""+a+b;
        int x = Integer.parseInt(s);
        int div,digit;
        for(div=n;div>0;div=div/10){
            digit = div%10;
            if(frequency(n,digit)!=frequency(x,digit))
                break;
        }
        if(div==0)
            return true;
        else
            return false;
    }
    static int frequency(int n,int d)
    {
        int div,digit,c=0;
        for(div=n;div>0;div=div/10){
            digit = div%10;
            if(digit == d)
                c++;
        }
        return c;
    }
}
