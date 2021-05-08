import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
public class TCPServer
{

    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        ServerSocket serverSocket = new ServerSocket(3600);
        System.out.println("Server is listening port 3600");
        Socket socket = serverSocket.accept();
        System.out.println("Request accepted");
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        String classFile = (String) ois.readObject();
        byte[] b = (byte[]) ois.readObject();
        FileOutputStream fis = new FileOutputStream(classFile);
        Executable ex = (Executable) ois.readObject();
        System.out.println("Starting Execution......");
        double startTime = System.nanoTime();
        String output = ex.execute();
        double endTime = System.nanoTime();
        double completionTime = endTime - startTime;
        System.out.println("[ DONE ]");
        ResultImpl r = new ResultImpl(output, completionTime);
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        classFile = "C://Users//hp//Desktop//Java Book Progames//SocketProgramming/sample.txt";
        oos.writeObject(classFile);
        FileInputStream fis1 = new FileInputStream(classFile);
        byte[] b1 = new byte[fis1.available()];
        fis1.read();
        oos.writeObject(b1);
        oos.writeObject(r);
        System.out.println("Result Sent");
        socket.close();
    }
    public static class ResultImpl implements Result, Serializable
    {

        String output;
        double completionTime;

        public ResultImpl(String o, double c)
        {
            output = o;
            completionTime = c;
        }

        @Override
        public String output()
        {
            return output;
        }

        @Override
        public double completionTime()
        {
            return completionTime;
        }
    }
}
