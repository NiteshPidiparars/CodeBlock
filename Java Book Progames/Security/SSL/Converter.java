import java.io.*;
import java.security.cert.*;
public class Converter
{
    public static void main(String[]args)
    {
        try{
            InputStream inStream = new FileInputStream("C:/Users/hp/Desktop/Java Book Progames/Security/SSL/ca1.pem");
            CertificateFactory factory = CertificateFactory.getInstance("X.509");
            Certificate cert = (X509Certificate)factory.generateCertificate(inStream);
            byte[] bytes = cert.getEncoded();
            if("C:/Users/hp/Desktop/Java Book Progames/Security/SSL/ca1.pem".equals("fromder")){
                Writer wr = new OutputStreamWriter(new FileOutputStream(""));
                wr.write("------BEGIN CERTIFICATE-----".toCharArray());
                wr.write(new sun.misc.BASE64Encoder().encode(buf));
                wr.write("------END CERTIFICATE-------".toCharArray());
                wr.flush();
            }
            if("".equals("toder")){
                FileOutputStream os = new FileOutputStream("C:/Users/hp/Desktop/Java Book Progames/Security/SSL/ca1.pem");
                os.write(bytes);
                os.close();
            }
        }catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
