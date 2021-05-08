import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
public class UDPObjectSender {
    public static void main(String[]args) throws SocketException, IOException{
        //create a Datagram
        DatagramSocket socket = new DatagramSocket();
        //create a message Object to be sent
        Message msg = new Message("Remainder", "Return my book on Monday");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(msg);
        //Multicast group where packet has to be sent
        byte[] b = bos.toByteArray();
        InetAddress addr = InetAddress.getByName("");
        int port = 8080;
        //create a Datagram with buffer, address and port
        DatagramPacket packet = new DatagramPacket(b, b.length, addr, port);
        //sent the packet now
        socket.send(packet);
        System.out.println("Send an Object");
        socket.close();
    }
}
