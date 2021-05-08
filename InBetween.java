import java.util.*;
class InBetween
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a[],n,i,j,t,x;
        System.out.println("Enter the value of n: ");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("Enter the "+n+" Array: ");
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(i=1;i<n;i++){
            for(j=0;j<=n-2;j++){
                if(a[j]>a[j+1]){
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
                System.out.println("The Missing element are: ");
                x=a[0]+1;
                i=1;
                while(i<n){
                    if(x>=a[i]){
                        x=a[i]+1;
                        i++;
                    }
                    else{
                        System.out.println(x+" ");
                        x++;
            }
        }
    }
}
