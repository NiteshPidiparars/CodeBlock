import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.KeyStore.ProtectionParameter;
import java.security.KeyStore.SecretKeyEntry;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
public class RetrevingKeyFromKeyStrore
{
    public static void main(String[]args)throws Exception
    {
        KeyStore keyStore = KeyStore.getInstance("JCEKS");
        char[] password = "changeit".toCharArray();
        String path = "C:/Program Files/Java/jre1.8.0_212/lib/security/cacerts";
        java.io.FileInputStream fin = new java.io.FileInputStream(path);
        keyStore.load(fin, password);

        ProtectionParameter protectedPassword = new KeyStore.PasswordProtection(password);
        SecretKey secretkey = new SecretKeySpec("myPassword".getBytes(),"DSA");
        SecretKeyEntry secretEntry = new SecretKeyEntry(secretkey);
        keyStore.setEntry("secretKeyAlias", secretEntry, protectedPassword);

        java.io.FileOutputStream fout = null;
        fout = new java.io.FileOutputStream("new KeyStoreName");
        keyStore.store(fout, password);

        SecretKeyEntry secretEnt = (SecretKeyEntry)keyStore.getEntry("secretKeyAlias",protectedPassword);
        SecretKey sk = secretEnt.getSecretKey();
        System.out.println("Algorithm used to generated key :"+sk.getAlgorithm());
        System.out.println("Format used for the key : "+sk.getFormat());
    }
}
