/* WAP to Count and print the words which have at least a pair
   of consecutive letters.
   Input : MODEM IS AN ELECTRONIC DEVICE
   Output : MODEM
            DEVICE
   Number of words containing consecutive letters : 2 */
import java.util.*;
public class ConsecutiveLetter
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s,w="";
        char ch,ch1,ch2;
        int i,j,l,wl;
        System.out.println("Enter the sentences : ");
        s = sc.nextLine();
        s = s + " ";
        l = s.length();
        System.out.println("Such words are : ");
        for(i=0;i<l;i++){
            ch = s.charAt(i);
            if(ch!=' ')
                w+=ch;
            else{
                wl = w.length();
                for(j=1;j<wl;j++){
                    ch1 = w.charAt(j-1);
                    ch2 = w.charAt(j);
                    if(++ch1 == ch2){
                        System.out.println(w);
                        break;
                    }
                }
                w="";
            }
        }
    }
}
