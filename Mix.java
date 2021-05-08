import java.util.*;
class Mix
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a1[],a2[],a3[],i,j,n;
        System.out.println("Enter the number of value: ");
        n=sc.nextInt();
        a1=new int[n];
        a2=new int[n];
        a3=new int[n+n];
        System.out.println("Enter the first array: ");
        for(i=0;i<n;i++)
            a1[i]=sc.nextInt();
        System.out.println("Enter the second array: ");
        for(i=0;i<n;i++)
            a2[i]=sc.nextInt();
        System.out.println("Combinning array is: ");
        for(i=0;i<n;i++){
            a3[2*i]=a1[i];
            a3[2*i+1]=a2[i];
        }
        n*=2;
        System.out.println("Resulting array is: ");
        for(i=0;i<n;i++)
            System.out.println(a3[i]+" ");
    }
}
