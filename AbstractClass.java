abstract class Games
{
   public abstract void start();
    public void stop()
    {
        System.out.println("Stopping game in class");
    }
}
class GameA extends Games
{
    public void start()
    {
        System.out.println("Starting Game A");
    }
}
class GameB extends Games
{
    public void start()
    {
        System.out.println("Starting Game B");
    }
}
class AbstractClass
{
    public static void main(String[]args)
    {
        Games A=new GameA();
        Games B=new GameB();
        Games C=new GameC();
        A.start();
        B.start();
        A.stop();
        B.stop();
    }
}
