import java.io.*;
import java.math.*;
class ResultantPalindrome
{
    static int i=1;
    public void addNum(String num)
    {
        BigInteger a,b,c;
        a=new BigInteger(num);
        b=new BigInteger(reverse(num));
        System.out.println("Step "+(i++)+"\t->\t"+a+" + "+b+" = "+(a.add(b)));
        resultantPalindrome(a.add(b)+"");
    }
    public void resultantPalindrome(String num)
    {
        if(num.equals(reverse(num))){
            System.out.println("ResultantPalindrome are: "+num);
        }
        else
        {
            addNum(num);
        }
    }
    public String reverse(String num)
    {
        StringBuffer sb=new StringBuffer(num);
        return sb.reverse().toString();

    }
    public static void main(String[]args)throws IOException
    {
        InputStreamReader istream=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(istream);
        String palindrome=null;
        System.out.println("Enter the number for Resultant Palindrome: ");
        try
        {
            palindrome=bf.readLine();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(" ");
        ResultantPalindrome rp=new ResultantPalindrome();
        rp.resultantPalindrome(palindrome);
    }
};
