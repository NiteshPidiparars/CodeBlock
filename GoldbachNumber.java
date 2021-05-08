import java.util.*;
class GoldbachNumber
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int PrimeArray[]=new int[50],ne=0;
        int i,j=0,n,c,x;
        for(n=3;n<50;n++){
            c=0;
            for(i=1;i<=n;i++){
                if(n%i==0)
                    c++;
            }
            if(c==2)
                PrimeArray[ne++]=n;
        }
        System.out.println("Enter the positive even number(<9 && <50): ");
        n=sc.nextInt();
        if(n<=9 || n>=50){
            System.out.println("Invalid input, number is not found");
        }
        else if(n%2==1){
            System.out.println("Invalid input,number is odd");
        }
        else{
            System.out.println("Prime Pairs are: ");
            for(i=0;i<ne;i++){
                for(j=i;j<ne;j++){
                    x=PrimeArray[i]+PrimeArray[j];
                    if(x==n){
                        System.out.println(PrimeArray[i]+","+PrimeArray[j]);
                    }
                    else if(x>n){
                        break;
                    }
                }
            }
        }
    }
}
