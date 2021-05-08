import java.util.*;
class primorialNumber
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int res=2,flag=0;
        String str="2";
        for(int i=3;i<=num;i++){
            flag=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag!=1){
                res=res*i;
                str=str+" * "+i;
            }
        }
        System.out.println(num+" #= "+str+"="+res);
    }
}
