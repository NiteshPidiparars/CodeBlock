import java.util.*;
class NivenNumber1
{
    public static void main(String[]args)
    {
        int a[]={13,45,16,49,86,87,97,95,56,54,52};
        int i,digits,div,s;
        System.out.println("Niven number are: ");
        for(i=0;i<a.length;i++){
            s=0;
            for(div=a[i];div>0;div=div/10)
            {
                digits=div%10;
                s+=digits;
            }
            if(a[i]%s==0)
                System.out.println(a[i]);
        }
    }
}
