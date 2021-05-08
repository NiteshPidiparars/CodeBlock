import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Random;
public class ScoreSender {
    public static void main(String[]args) throws UnknownHostException, SocketException, InterruptedException, IOException{
        long score = 0, run;
        Random r = new Random();
        InetAddress addr = InetAddress.getByName("DESKTOP-N9QLGBV");
        int port = 8080;
        DatagramSocket socket = new DatagramSocket();
        while(true){
            do{
                Thread.sleep(1000+r.nextInt(1000));
            }while((run = r.nextInt(7)) == 0);
            score += run;
            String msg = "Score : "+score;
            byte[] b = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(b, b.length, addr, port);
            socket.send(packet);
            System.out.println("Sent---> "+msg);
        }
    }
}
