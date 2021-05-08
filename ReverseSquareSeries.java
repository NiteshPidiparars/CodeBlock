import java.util.*;
class ReverseSquareSeries
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int num,i,div,sq,digits,s,rev;
        System.out.println("Enter the how many terms: ");
        n=sc.nextInt();
        num=9;
        s=0;
        for(i=1;i<=n;i++){
            sq=num*num;
            rev=0;
            sign=1;
            for(div=sq;div>0;div=div/10){
                digits=div%10;
                rev=rev*10+digits;
            }
            s=s+sign*rev;
            sign=sign*-1;
        }
        System.out.println("Sum of Series: "+s);
    }
}
