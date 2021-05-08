import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
public class HelloReceiver {

    public static void main(String[] args) throws IOException {
        //create a multicasting and bind to port 8080
        MulticastSocket socket = new MulticastSocket(8080);
        //join the multicast group
        socket.joinGroup(InetAddress.getByName("224.0.0.1"));
        //construct the datagram packet to receive packet
        byte[] b = new byte[256];
        DatagramPacket packet = new DatagramPacket(b, b.length);
        System.out.println("Waiting for receiving for packet");
        //Receive the packet now and display
        socket.receive(packet);
        String msg = new String(b, 0, packet.getLength());
        System.out.println("Received : " + msg);
    }
}
