/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author hp
 */
public class UDPFactClient {

    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        byte[] rbuf = new byte[1024], sbuf = new byte[1024];
        BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket socket = new DatagramSocket();
        InetAddress addr = InetAddress.getByName("DESKTOP-N9QLGBV");
        //get an Integer fomr User
        System.out.print("Enter the Integer : ");
        String data = fromUser.readLine();
        sbuf = data.getBytes();
        DatagramPacket spkt = new DatagramPacket(sbuf, sbuf.length, addr, 8080);
        //send to server
        socket.send(spkt);
        System.out.println("Sent to Server : " + data);
        DatagramPacket rpkt = new DatagramPacket(rbuf, rbuf.length);
        //reterive result
        socket.receive(rpkt);
        data = new String(rpkt.getData(), 0, rpkt.getLength());
        System.out.println("Received from Server : " + data);
        socket.close();
    }
}
