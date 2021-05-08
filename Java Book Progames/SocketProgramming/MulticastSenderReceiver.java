import java.io.*;
import java.net.*;
public class MulticastSenderReceiver
{
    String name;
    InetAddress addr;
    int port = 8080;
    MulticastSocket socket;
    public static void main(String[]args)
    {
        new MulticastSenderReceiver("");
    }
    private MulticastSenderReceiver(String name)
    {
        this.name = name;
        try
        {
            addr = InetAddress.getByName("224.0.0.1");
            socket = new MulticastSocket(port);
            new Receiver().start();
            new Sender().start();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private class Receiver extends Thread
    {
        public void run()
        {
            try
            {
                byte[] out = new byte[256];
                DatagramPacket packet = new DatagramPacket(out, out.length);
                socket.joinGroup(addr);
                while(true)
                {
                    socket.receive(packet);
                    System.out.println(packet.getData()+" : "+packet.getLength());
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    private class Sender extends Thread
    {
        public void run()
        {
            try
            {
                BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in));
                String msg = name+" : "+fromUser.readLine();
                byte[] out = msg.getBytes();
                DatagramPacket packet = new DatagramPacket(out, out.length, addr, port);
                socket.send(packet);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
