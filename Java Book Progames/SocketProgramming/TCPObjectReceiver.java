import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author hp
 */
public class TCPObjectReceiver {
    public static void main(String[]args) throws IOException, ClassNotFoundException{
        //create server socket at port 8080
        ServerSocket serverSocket = new ServerSocket(3600);
        //waiting for inconming connection
        System.out.println("Server is listening on port 3600");
        Socket socket = serverSocket.accept();
        System.out.println("Request accepted");
        //create ObjectInputStream object
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        //store the object
        Message message = (Message) ois.readObject();
        //print the message
        System.out.println("Received a message");
        System.out.println("Subject : "+message.getSubject()+"\nBody : "+message.getText());
    }
}
