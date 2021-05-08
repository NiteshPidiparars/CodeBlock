import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
public class TCPClient
{

    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Socket socket = new Socket("DESKTOP-N9QLGBV", 3600);
        System.out.println("Connected to LocalHost at port 3600");
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        String classFile = "C://Users//hp//Desktop//Java Book Progames//SocketProgramming/sample.txt";
        oos.writeObject(classFile);
        FileInputStream fis = new FileInputStream(classFile);
        byte[] b = new byte[fis.available()];
        fis.read();
        oos.writeObject(b);
        Job aJob = new Job();
        oos.writeObject(aJob);
        System.out.println("Submitted a job for execution");
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        classFile = (String) ois.readObject();
        b = (byte[]) ois.readObject();
        FileOutputStream fos = new FileOutputStream(classFile);
        fos.write(b);
        Result r = (Result) ois.readObject();
        System.out.println("result : " + r.output() + ", time taken : " + r.completionTime() + " ns");
        socket.close();
    }

    private static class Job implements Executable, Serializable
    {
        @Override
        public String execute()
        {
            int n = 5, prob = 1;
            for (int i = 2; i <= n; i++)
            {
                prob *= i;
            }
            return (new Integer(prob)).toString();
        }
    }

}
