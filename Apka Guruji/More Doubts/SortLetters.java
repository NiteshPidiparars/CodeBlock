/* WAP a program in Java to a accept a word Arrange all the alphabets of the
   word is ascending order and display the new word (using array).
   Input : BLUEJ
   Output : BEJLU */
import java.util.*;
public class SortLetters
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String w,rw;
        int i,l,j;
        char arr[],t;
        System.out.println("Enter the Word : ");
        w = sc.next();
        l = w.length();
        arr = new char[l];
        for(i=0;i<l;i++){
            arr[i] = w.charAt(i);
        }
        for(i=1;i<l;i++){
            for(j=0;j<l-i;j++){
                if(arr[j]>arr[j+1]){
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        rw="";
        for(i=0;i<l;i++){
            rw += arr[i];
        }
        System.out.println("Resulting word is : "+rw);
    }
}
