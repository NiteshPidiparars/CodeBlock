import java.io.*;
class DuckNumber
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        String n=bf.readLine();
        int l=n.length();
        int c=0;
        for(int i=1;i<l;i++){
            char ch=n.charAt(i);
            if(ch=='0')
                c++;
            }
            char f=n.charAt(0);
            if(c>0&&f!='0')
                System.out.println("is a duck number");
            else
                System.out.println("is a not duck number");
    }
}
