import java.util.*;
class UniqueNumber
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n,digits,div,ds,i,c;
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        for(ds=0;ds<=9;ds++){
            c=0;
            for(div=n;div>0;div=div/10){
                digits=div%10;
                if(digits==ds)
                    c++;
            }
            if(c>1){
                break;
            }
        }
        if(ds==10)
            System.out.println("its unique number.");
        else
            System.out.println("its not unique number.");
    }
}
