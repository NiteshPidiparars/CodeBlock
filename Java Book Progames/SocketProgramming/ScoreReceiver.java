import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
public class ScoreReceiver {
    public static void main(String[]args) throws UnknownHostException, IOException{
        byte[] b = new byte[256];
        InetAddress addr = InetAddress.getByName("224.0.0.1");
        MulticastSocket socket = new MulticastSocket(8080);
        socket.joinGroup(addr);
        while(true){
            DatagramPacket packet = new DatagramPacket(b, b.length);
            socket.receive(packet);
            String msg = new String(b, 0, packet.getLength());
            System.out.println("Received<--- "+msg);
        }
    }
}
