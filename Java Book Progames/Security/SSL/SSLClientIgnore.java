import javax.net.ssl.*;
import java.io.*;
import java.security.*;
import java.security.cert.*;
public class SSLClientIgnore
{
    public static void main(String[]args)
    {
        try{
            TrustManager[] trustAllCerts = {
                new X509TrustManager(){
                    public X509Certificate[] getAcceptedIssuers(){return null;}
                    public void checkClientTrusted(X509Certificate[] certs, String authType){}
                    public void checkServerTrusted(X509Certificate[] certs, String authType){}
                }
            };

            SSLContext context = SSLContext.getInstance("SSL");
            context.init(null, trustAllCerts, new SecureRandom());
            SSLSocketFactory sss = (SSLSocketFactory)context.getSocketFactory();
            //SSLSocketFactory factory = (SSLSocketFactory)context.getDefault();
            SSLSocket ss = (SSLSocket)sss.createSocket("DESKTOP-N9QLGBV",3600);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader in = new BufferedReader(new InputStreamReader(ss.getInputStream()));
            PrintWriter out = new PrintWriter(ss.getOutputStream(), true);
            String line = null;
            while((line = br.readLine()) != null){
                out.println(line);
                System.out.println("send---->"+line);
                System.out.println("received<----"+in.readLine());
            }
        }catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
