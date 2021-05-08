import java.util.*;
class NivenInArray
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]={13,34,45,55,66,86,97};
        int div,digits,s,i;
        System.out.println("The Niven Number is: ");
        for(i=0;i<a.length;i++){
            s=0;
            for(div=a[i];div>0;div=div/10){
                digits=div%10;
                s+=digits;
            }
            if(a[i]%s==0)
                System.out.println(a[i]);
        }
    }
}
