import java.util.*;
class UniqueNumber1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,ds,digits,div;
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
            System.out.println("number is unique");
        else
            System.out.println("number is not unique");
    }
}
