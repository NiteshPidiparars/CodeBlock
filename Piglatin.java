import java.util.*;
class Piglatin
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        final String Vowels="aeiouAEIOU";
        System.out.println("Enter done to exit.");
        System.out.println("Enter the string: ");
        String word=sc.nextLine();
        while(!word.equalsIgnoreCase("done")){
            String beforVowel="";
            int cut=0;
            if(cut<word.length()&&!Vowels.contains(""+word.charAt(cut))){
                beforVowel+=word.charAt(cut);
                cut++;
            }
            if(cut==0){
                cut=1;
                word+=word.charAt(0)+"w";
            }
            System.out.println("PigLatin: "+word.substring(cut)+beforVowel+"ay");
            System.out.println("Enter the word: ");
            word=sc.nextLine();
        }
    }
}
