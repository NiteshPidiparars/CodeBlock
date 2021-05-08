public class ThreadCommSpin extends Thread
{
    static int turn = 0;
    int  buf[],n =2;
    public int nextPrime()
    {
        while(true)
        {
            boolean prime = true;
            for(int i=2; i<=n/2; i++)
                if(n%i==0){prime = false;break;}
                if(prime)
                    return n++;
                else
                    n++;
        }
    }
    public ThreadCommSpin(int[] a)
    {
        buf = a;
        start();
    }
    public void run()
    {
        while(true)
        {
            while(turn != 0);
            buf[0] = nextPrime();
            turn = 1;
        }
    }
    public static void main(String[]args)
    {
        int[] a = new int[1];
        ThreadCommSpin tc = new ThreadCommSpin(a);
        while(true)
        {
            while(turn != 1);
            System.out.println(a[0]+" ");
            turn = 0;
        }
    }
}
