import javax.net.ssl.*;
import java.io.*;
import java.security.*;
public class SSLServer1
{
    public static void main(String[]args)
    {
        try{
            char[] password = "nitesh@19".toCharArray();
            KeyStore ks = KeyStore.getInstance("JKS");
            ks.load(new FileInputStream("server.ks"), password);
            KeyStore ts = KeyStore.getInstance("JKS");
            ts.load(new FileInputStream("server.ts"), password);
            KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
            kmf.init(ks, password);
            TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
            tmf.init(ts);

            SSLContext context = SSLContext.getInstance("TLS");
            context.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);

            SSLServerSocketFactory factory = (SSLServerSocketFactory)context.getServerSocketFactory();
            //SSLServerSocketFactory factory = (SSLServerSocketFactory)context.getDefault();
            SSLServerSocket sss = (SSLServerSocket)factory.createServerSocket(8080);
            SSLSocket ss = (SSLSocket)sss.accept();
            ss.setNeedClientAuth(true);
            BufferedReader in = new BufferedReader(new InputStreamReader(ss.getInputStream()));
            PrintWriter out = new PrintWriter(ss.getOutputStream(), true);
            String line = null;
            while((line = in.readLine()) != null){
                System.out.println("received<----"+line);
                out.println(line);
                System.out.println("send---->"+line);
            }
        }catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
