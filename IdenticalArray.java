import java.util.*;
class IdenticalArray
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("Enter the term of n: ");
        n=sc.nextInt();
        int a1[]=new int[n];
        int a2[]=new int[n];
        System.out.println("Enter "+n+" number for the first array: ");
        for(i=0;i<n;i++){
            a1[i]=sc.nextInt();
        }
        System.out.println("Enter "+n+" number for the second array: ");
        for(i=0;i<n;i++){
            a2[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            if(a1[i]!=a2[i])
                break;
        }
        if(i==n)
            System.out.println("Array is Identical");
        else
            System.out.println("Not Identical because the value of index "+i+" does identical");
    }
}
