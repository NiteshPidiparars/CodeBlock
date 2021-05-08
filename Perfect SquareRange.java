import java.util.*;
class Perfect SquareRange
{
    public static void main(String[]args)
    {
        int start,end,sum=0,n;
        float s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start value: ");
        start=sc.nextInt();
        System.out.println("Enter end value: ");
        end=sc.nextInt();
        System.out.println("Perfect square number present in the range"+start+"to"+end+"are");
        for(int i=start;i<end;i++){
            s=(float)Math.sqrt(i);
            n=(int)Math.floor(s);
            if(s==n){
                System.out.println(n+"\t");
                s=s+i;
            }
        }
        System.out.println("Sum of Perfect square number present in the range"+start+"to"+end+"are"+sum);
    }
}
