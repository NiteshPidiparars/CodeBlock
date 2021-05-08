import java.rmi.RemoteException;
public class SchedulerImpl implements Scheduler
{
    public SchedulerImpl()
    {
        super();
    }
    public Result run(Job aJob)throws RemoteException
    {
        double startTime = System.nanoTime();
        String output = aJob.run();
        double endTime = System.nanoTime();
        return new ResultImpl(output, endTime - startTime);
    }
}
