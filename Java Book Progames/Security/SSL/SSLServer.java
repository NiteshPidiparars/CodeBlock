import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
public class SSLServer {
    public static void main(String[]args){
        try{
            SSLServerSocketFactory factory = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
            SSLServerSocket sss = (SSLServerSocket) factory.createServerSocket(8080);
            SSLSocket ss = (SSLSocket) sss.accept();
            System.setProperty("javax.net.ssl.keyStore","server.ks");
            System.setProperty("javax.net.ssl.keyStorePassword","nitesh@19");
            BufferedReader bf = new BufferedReader(new InputStreamReader(ss.getInputStream()));
            PrintWriter out = new PrintWriter(ss.getOutputStream(), true);
            String line = null;
            while((line = bf.readLine()) != null){
                System.out.println("Received<----"+line);
                out.println(line);
                System.out.println("Sent---->"+line);
            }
        }catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
