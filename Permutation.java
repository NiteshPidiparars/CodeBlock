import java.util.*;
public class Permutation
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String original=sc.nextLine();
        System.out.println("Result are: ");
        permute(original);
    }
    public static void permute(String input)
    {
        int inputLength=input.length();
        boolean[] used=new boolean[inputLength];
        StringBuffer outputString=new StringBuffer();
        char[] in=input.toCharArray();
        dopermute(in,outputString,used,inputLength,0);
        }
        public static void dopermute(char[] in,StringBuffer outputString,boolean[]used,int inputLength,int level)
        {
            if(level==inputLength){
                System.out.println(outputString.toString());
                return;
            }
            for(int i=0;i<inputLength;i++){
                if(used[i])
                    continue;
                outputString.append(in[i]);
                used[i]=true;
                dopermute(in,outputString,used,inputLength,level+1);
                used[i]=false;
                outputString.setLength(outputString.length()-1);
        }
    }
}
