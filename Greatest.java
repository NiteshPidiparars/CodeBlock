import java.util.*;
public class Greatest
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        System.out.println("Enter "+num+" elements: ");
        int max=sc.nextInt();
        for(int i=0;i<num;i++){
            int temp=sc.nextInt();
            if(temp<max)
                continue;
            else
                max=temp;
        }
        System.out.println("Largest Number is: "+max);
    }
}
