import java.util.*;
class FrequencyOfString
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        int i,l,j,p,f=0;
        System.out.println("Enter the string: ");
        s1=sc.nextLine();
        s2=sc.nextLine();
        l=s1.length();
        i=0;
        while(i<l){
            p=s1.indexOf(s2,i);
            if(p!=-1){
                f++;
                i=p+1;
            }
            else
                break;
        }
        if(f==0){
            System.out.println("Does not exist");
        }
        else{
            System.out.println("Frequency is: "+f);
        }
    }
}
