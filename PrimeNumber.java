import java.util.*;
class PrimeNumber
{
    public static void main(String[]args)
    {
        int n,status=1,num=3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        if(n>=1){
            System.out.println("First "+n+" prime are: ");
            System.out.println();
        }
        for(int count=2;count<=n;){
            for(int i=2;i<=num-1;i++){
                if(num%i==0){
                    status=0;
                    break;
                }
            }
            if(status!=0){
                System.out.println(num);
                count++;
            }
            status=1;
            num++;
        }
    }
}
