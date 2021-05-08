public class Multiplication_Table implements Runnable
{
    private int number;
    public Multiplication_Table(int number)
    {
        this.number = number;
    }
    public void run()
    {
        for(int i=1; i<=10; i++){
            System.out.printf("%s : %d * %d : %d\n",Thread.currentThread().getName(),number,i,i*number);
        }
    }
    public static void main(String[]args)
    {
        System.out.println("I will print table from 1 to 5: ");
        for(int i=1; i<=5; i++){
            Multiplication_Table mt = new Multiplication_Table(i);
            Thread t = new Thread(mt);
            t.start();
        }
    }
}
