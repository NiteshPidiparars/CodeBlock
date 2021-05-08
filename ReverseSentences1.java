import java.io.*;
import java.util.*;
class ReverseSentences1
{
    public static void main(String[]args)throws IOException
    {
        System.out.println("Enter Sentence: ");
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String sentence=bf.readLine();
        ArrayList al=new ArrayList();
        al=recursiveReverseMethod(sentence,al);
        al.trimToSize();
        StringBuilder sb=new StringBuilder();
        for(int i=al.size()-1;i>=0;i--){
            sb.append(al.get(i)+"");
        }
        System.out.println("Reverse Sentences: "+sb);
    }
    public static ArrayList recursiveReverseMethod(String sentence,ArrayList al)
    {
        int index=sentence.indexOf(" ");
        al.add(sentence.substring(0,index));
        sentence=sentence.substring(index+1);
        if(sentence.indexOf("")==-1){
            al.add(sentence.substring(0));
            return al;
        }
        return recursiveReverseMethod(sentence,al);
    }
}

