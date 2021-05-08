import java.io.*;
import java.security.*;
import java.security.cert.*;
import java.util.*;
public class ReadKeyStore
{
    public static void main(String[]args)
    {
        try{
            char[] password = "nitesh@19".toCharArray();
            KeyStore ks = KeyStore.getInstance("JKS");
            ks.load(new FileInputStream("C:/Users/hp/Desktop/Java Book Progames/Security/SSL/test.jks"), password);

            String alias = "mykey";
            FileOutputStream kos = new FileOutputStream("key.der");
            Key pri = ks.getKey(alias, password);
            kos.write(pri.getEncoded());

            FileOutputStream cos = new FileOutputStream("cert.der");
            java.security.cert.Certificate cert = ks.getCertificate(alias);
            cos.write(cert.getEncoded());
        }catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
