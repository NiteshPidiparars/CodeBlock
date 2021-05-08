import java.io.*;
class LargestSmallest
{
    public static void main(String[]args)throws IOException
    {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        int num=Integer.parseInt(bf.readLine());
        int a[]=new int[num];
        System.out.println("Enter "+num+" entered: ");
        for(int i=0;i<num;i++){
            a[i]=Integer.parseInt(bf.readLine());
        }
        for(int i=1;i<(num-1);i++){
            for(int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Largest number is: "+a[num-1]);
        System.out.println("Smallest number is: "+a[0]);
    }
}
