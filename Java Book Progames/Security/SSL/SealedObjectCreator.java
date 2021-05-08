import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SealedObject;
import javax.crypto.SecretKey;
import javax.security.cert.X509Certificate;
public class SealedObjectCreator {
    public static void main(String[]args)throws Exception{
        String alg = "DES", target = "Hello World!";
        PublicKey pub = X509Certificate.getInstance(new FileInputStream("C:/Users/hp/Desktop/Java Book Progames/Security/SSL/test.cer")).getPublicKey();
        Cipher cipher = Cipher.getInstance(pub.getAlgorithm());
        cipher.init(Cipher.ENCRYPT_MODE, pub);
        KeyGenerator keyGenerator = KeyGenerator.getInstance(alg);
        SecretKey secretKey = keyGenerator.generateKey();
        SealedObject so = new SealedObject(secretKey.getEncoded(), cipher);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("key"));
        out.writeObject(so);

        cipher = Cipher.getInstance(alg);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        so = new SealedObject(target, cipher);
        out = new ObjectOutputStream(new FileOutputStream("data"));
        out.writeObject(so);
        out.close();
    }
}
