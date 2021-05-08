import java.util.*;
import java.io.*;
import java.security.*;
import java.security.cert.*;
import java.security.spec.*;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
public class WriteKeyStore
{
    public static void main(String[]args)
    {
        try{
            char[] password = "nitesh@19".toCharArray();
            String alias = "akey", name = "aStore.jks";
            KeyStore ks = KeyStore.getInstance("JKS","SUN");
            ks.load(null, password);

            FileInputStream fis = new FileInputStream("C:/Users/hp/Desktop/Java Book Progames/Security/SSL/key.der");
            byte[] kdata = new byte[fis.available()];
            fis.read(kdata);

            PKCS8EncodedKeySpec kp = new PKCS8EncodedKeySpec(kdata);
            KeyFactory factory = KeyFactory.getInstance("DSA");
            PrivateKey pri = factory.generatePrivate(kp);

            CertificateFactory cf = CertificateFactory.getInstance("X.509");

            Collection c = cf.generateCertificates(new FileInputStream("C:/Users/hp/Desktop/Java Book Progames/Security/SSL/cert.der"));
            Certificate[] certs = new Certificate[c.size()];

            int in = 0;
            for(Iterator i = c.iterator(); i.hasNext();)
                certs[in++] = (Certificate)i.next();
            ks.setKeyEntry(alias, pri, password, certs);
            ks.store(new FileOutputStream(name), password);
            System.out.println("Key and Certificate Stored.");
        }catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
