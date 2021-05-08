import java.util.*;
class ArrayFactorial
{
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       int a[]={2,3,4,5,6,7,7,8,9,14},i,j;
       long f;
       for(i=0;i<a.length;i++){
        if(a[i]%2==0){
            f=1;
            for(j=1;j<=a[i];j++){
                f=f*j;
            }
            System.out.println("Factorial of "+a[i]+" = "+f);
        }
       }
    }
}
