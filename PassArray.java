import java.io.*;
class PassArray
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int [5];
        int i,l;
        System.out.println("Enter the number: ");
        for(i=0;i<5;i++){
            a[i]=Integer.parseInt(bf.readLine());
        }
        l=findLargest(a);
        System.out.println("Largest is: "+l);
    }
    public static int findLargest(int a[])
    {
        int i,l;
        l=a[0];
        for(i=1;i<a.length;i++){
            if(a[i]>l)
                l=a[i];
        }
        return l;
    }
};
