import java.util.*;
class MyThread extends Thread
{
    int[] a;
    MyThread(int[] ar)
    {
        ar = a;
        start();
    }
    public void run()
    {
        java.util.Arrays.sort(a);
        System.out.println("Completion Sorting Process..");
    }
}
public class JoinDemo
{
    public static void main(String[]args)throws Exception
    {
        int a[] = {2,4,0,6,5};
        int b[] = {1,3,7,8,9};
        MyThread t1 = new MyThread(a);
        MyThread t2 = new MyThread(b);
        t1.join();
        t2.join();
        int result[] = marge(a,b);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    static int[] marge(int a[],int b[])
    {
        int i=0,j=0,k=0;
        int[] result = new int[a.length+b.length];
        while(i<a.length && j<b.length){
            if(a[i]<b[j])
                result[k++] = a[i++];
            else
                result[k++] = b[j++];
        }
        while(i<a.length)
            result[k++] = a[i++];
        while(j<b.length)
            result[k++] = b[j++];
        return result;
    }
}
