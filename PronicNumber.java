import java.util.*;
class PronicNumber
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n,root,rootPlus1,p;
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        root=(int)Math.sqrt(n);
        rootPlus1=root+1;
        p=root*rootPlus1;
        if(p==n){
            System.out.println("its PronicNumber");
        }else{
            System.out.println("its not PronicNumber");
        }
    }
}
