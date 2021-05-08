import java.io.*;
import java.security.*;
import java.net.*;
import javax.net.*;
import java.security.cert.*;
import javax.net.ssl.*;
public class HTTPSClient
{
    public static void main(String[]args)
    {
        try{
            String urlString = "https://DESKTOP-N9QLGBV/index.html";
            URL url = new URL(urlString);
            TrustManager[] trustAllCerts = {
                new X509TrustManager(){
                    public X509Certificate[] getAcceptedIssuers(){return null;}
                    public void checkClientTrusted(X509Certificate[] certs, String authType){}
                    public void checkServerTrusted(X509Certificate[] certs, String authType){}
                }
            };
            SSLContext context = SSLContext.getInstance("SSL");
            context.init(null, trustAllCerts, new SecureRandom());
            SocketFactory factory = context.getSocketFactory();
            Socket socket = factory.createSocket(url.getHost(), url.getPort());
            PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out.println("GET : "+urlString+ " HTTP/1.1\n");
            String line = null;
            while((line = bf.readLine()) != null)
                System.out.println(line);
        }catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
