public class Factorial implements Job,  java.io.Serializable
{
    int n;
    public Factorial(int v)
    {
        this.n = v;
    }
    public String run()
    {
        int result = 1;
        for(int i=2;i<=n;i++)
            result *= i;
        return String.valueOf(result);
    }
}
