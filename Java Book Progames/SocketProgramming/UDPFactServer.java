/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * @author hp
 */
public class UDPFactServer {

    public static void main(String[] args) throws SocketException, IOException {
        byte[] rbuf = new byte[10], sbuf = new byte[10];
        //create a server socket at port 8080
        DatagramSocket socket = new DatagramSocket(8080);
        System.out.println("Server Ready");
        DatagramPacket rpkt = new DatagramPacket(rbuf, rbuf.length);
        //receive a packet from client
        socket.receive(rpkt);
        //extract data and client information from this packet
        String data = new String(rpkt.getData(), 0, rpkt.getLength());
        InetAddress addr = rpkt.getAddress();
        int port = rpkt.getPort();
        int fact = 1, n = Integer.parseInt(data);
        System.out.println("Received : " + n + " from " + addr + " : " + port);
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        sbuf = String.valueOf(fact).getBytes();
        DatagramPacket spkt = new DatagramPacket(sbuf, sbuf.length, addr, port);
        //send result to client
        socket.send(spkt);
        System.out.println("Send : " + fact);
    }
}
