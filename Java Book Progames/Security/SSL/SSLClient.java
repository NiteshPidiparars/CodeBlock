import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
public class SSLClient {
    public static void main(String[]args){
        try{
            SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
            SSLSocket ss = (SSLSocket) factory.createSocket("DESKTOP-N9QLGBV", 8080);
            System.setProperty("javax.net.ssl.trustStore","client.ts");
            System.setProperty("javax.net.ssl.trustStorePassword","nitesh@19");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader in = new BufferedReader(new InputStreamReader(ss.getInputStream()));
            PrintWriter out = new PrintWriter(ss.getOutputStream(), true);
            String line = null;
            while((line = br.readLine()) != null){
                out.println(line);
                System.out.println("Sent--->"+line);
                System.out.println("Received<---"+in.readLine());
            }
        }catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
