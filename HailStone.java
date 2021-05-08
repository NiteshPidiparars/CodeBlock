import java.util.*;
public class HailStone
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("This Program will generate HailStone Program");
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        while(n>1){
            if(n%2==0){
                n=n/2;
                System.out.println(n+"\t");
            }
            else
            {
                n=(n*3)+1;
                System.out.println(n+"\t");
            }
        }
    }
}
