import java.util.*;
class HappyWord
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String word,numberForm="";
        int placeValue,div,digits;
        int a[]=new int[100],n=0;
        int i,s,num,l;
        System.out.println("Enter the word: ");
        word=sc.nextLine();
        word=word.toUpperCase();
        l=word.length();
        for(i=0;i<l;i++){
            placeValue=word.charAt(i)-64;
            numberForm+=placeValue;
        }
        num=Integer.parseInt(numberForm);
        while(true)
        {
            s=0;
            for(div=num;div>0;div=div/10){
                digits=div%10;
                s=s+digits*digits;
            }
            if(s==1){
                System.out.println("yes.its a HappyWord");
                break;
            }
            else
            {
                for(i=0;i<n;i++){
                    if(a[i]==s){
                        break;
                    }
                }
            if(i==n){
                    a[n]=s;
                    n++;
                    num=s;
                }
                else{
                    System.out.println("No,its not HappyWord");
                    break;
                }
            }
        }
    }
}
