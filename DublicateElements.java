import java.util.*;
public class DublicateElements
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10],i,j;
        boolean alreadySearched,duplicateFound;
        for(i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Duplicate Elements are: ");
        for(i=0;i<10;i++){
            alreadySearched=false;
            for(j=i-1;j>=0;j--){
                if(a[j]==a[i]){
                    alreadySearched=true;
                    break;
                }
            }
            if(!alreadySearched){
                duplicateFound=false;
                for(j=i+1;j<10;j++){
                    if(a[j]==a[i]){
                        duplicateFound=true;
                        break;
                    }
                }
        if(duplicateFound){
            System.out.println(a[i]+" ");
                }
            }
        }
    }
}
