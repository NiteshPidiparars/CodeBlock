import java.io.*;
public class ReverseWordSentence
{
    public static void main(String[]args)throws IOException
    {
        int strLen,i,j;
        String str,reverse="",temp="";
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string: ");
        str=bf.readLine();
        strLen=str.length()-1;
        for(i=0;i<=strLen;i++){
            temp=temp+str.charAt(i);
            if((str.charAt(i)==' ')||(i==strLen)){
                for(j=temp.length()-1;j>=0;j--){
                    reverse=reverse+temp.charAt(j);
                    if((j==0)&&(i!=strLen))
                        reverse=reverse+" ";
                }
                temp=" ";
            }
        }
        System.out.println("Reverse of "+str+": "+reverse);
    }
}
