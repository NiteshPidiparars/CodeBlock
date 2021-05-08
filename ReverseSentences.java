import java.io.*;
class ReverseSentences
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string: ");
        String str=bf.readLine();
        String words[]=str.split("");
        System.out.println("Reverse Sentences: ");
        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i]+"");
        }
    }
}
