/* WAP to accept a sentence and sort its words in lexicographic order.
   Input : computer was born to solve problems
   Output : born computer problems solve to was. */
import java.util.*;
public class SortWords
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s,w="",arr[]=new String[20],t;
        int i,j,l,nw=0;
        char ch;
        System.out.println("Enter the sentence : ");
        s = sc.nextLine();
        s = s + " ";
        l = s.length();
        for(i=0;i<l;i++){
            ch = s.charAt(i);
            if(ch!=' '){
                w += ch;
            }else{
                arr[nw++] = w;
                w = "";
            }
        }
        for(i=1;i<nw;i++){
            for(j=0;j<nw-i;j++){
                if(arr[j].compareToIgnoreCase(arr[j+1])>0){
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        System.out.println("The New Sentence is : ");
        for(i=0;i<nw;i++)
            System.out.print(arr[i]+" ");
    }
}
