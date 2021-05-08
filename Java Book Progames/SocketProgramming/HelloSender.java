import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
public class HelloSender {

    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        //create DatagramSocket
        DatagramSocket socket = new DatagramSocket();
        //Fill the buffer with the data
        String msg = "Hello!!!!";
        byte[] b = msg.getBytes();
        //Multicasting group where pakcet has to be sent
        InetAddress addr = InetAddress.getByName("224.0.0.1");
        //port the receiving listener on
        int port = 8080;
        //create a datagram with buffer,address and port
        DatagramPacket packet = new DatagramPacket(b, b.length, addr, port);
        //sending a multicasting IP address and port
        System.out.println("Sending a packet");
        //sent the packet now
        socket.send(packet);
        System.out.println("Sent : " + msg);
    }
}
