public class ResultImpl implements Result, java.io.Serializable
{
    String output;
    double completionTime;
    public ResultImpl(String output, double completionTime)
    {
        this.output = output;
        this.completionTime = completionTime;
    }
    public String output()
    {
        return output;
    }
    public double completionTime()
    {
        return completionTime;
    }
}
