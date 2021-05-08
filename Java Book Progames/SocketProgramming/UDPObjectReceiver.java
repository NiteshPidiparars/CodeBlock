import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
public class UDPObjectReceiver {
    public static void main(String[]args) throws SocketException, IOException, ClassNotFoundException{
        //create a multicasting socket and bind into port 8080
        DatagramSocket socket = new DatagramSocket(8080);
        //construct a datagram to receive a packet
        byte[] b = new byte[256];
        DatagramPacket packet = new DatagramPacket(b, b.length);
        System.out.println("Waiting for receive a message object.....");
        //receive the packet now and display
        socket.receive(packet);
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Message msg = (Message) ois.readObject();
        System.out.println("Received an Object");
        System.out.println("Subject : "+msg.getSubject()+"\nBody : "+msg.getText());
    }
}
