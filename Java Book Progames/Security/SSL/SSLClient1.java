import javax.net.ssl.*;
import java.io.*;
import java.security.*;
public class SSLClient1
{
    public static void main(String[]args)
    {
        try{
            char[] password = "nitesh@19".toCharArray();
            KeyStore ks = KeyStore.getInstance("JKS");
            ks.load(new FileInputStream("client.ks"), password);
            KeyStore ts = KeyStore.getInstance("JKS");
            ts.load(new FileInputStream("client.ts"), password);
            KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
            kmf.init(ks, password);
            TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
            tmf.init(ts);

            SSLContext context = SSLContext.getInstance("TLS");
            context.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);

            SSLSocketFactory sss = (SSLSocketFactory)context.getSocketFactory();
            //SSLSocketFactory factory = (SSLSocketFactory)context.getDefault();
            SSLSocket ss = (SSLSocket)sss.createSocket("DESKTOP-N9QLGBV",8080);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader in = new BufferedReader(new InputStreamReader(ss.getInputStream()));
            PrintWriter out = new PrintWriter(ss.getOutputStream(), true);
            String line = null;
            while((line = br.readLine()) != null){
                out.println(line);
                System.out.println("send<----"+line);
                System.out.println("received---->"+in.readLine());
            }
        }catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
