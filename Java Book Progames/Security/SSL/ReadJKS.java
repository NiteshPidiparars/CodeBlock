import java.io.*;
import java.util.*;
import java.security.*;
import java.security.cert.*;
public class ReadJKS
{
    public static void main(String[]args)throws Exception
    {
        char[] password = "nitesh@19".toCharArray();
        KeyStore ks = KeyStore.getInstance("JKS");
        ks.load(new FileInputStream("C:/Users/hp/Desktop/Java Book Progames/Security/SSL/test.jks"), password);
        Enumeration e = ks.aliases();
        while(e.hasMoreElements()){
            String alias = (String)e.nextElement();
            KeyStore.ProtectionParameter prot = new KeyStore.PasswordProtection(password);
            KeyStore.PrivateKeyEntry pkEntry = (KeyStore.PrivateKeyEntry)ks.getEntry(alias, prot);
            PrivateKey pk = pkEntry.getPrivateKey();

            System.out.println(pk);
            java.security.cert.Certificate[] certs = pkEntry.getCertificateChain();
            for(java.security.cert.Certificate cert : certs)
                System.out.println(cert);
        }
    }
}
