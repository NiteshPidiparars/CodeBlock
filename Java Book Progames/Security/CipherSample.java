import java.security.*;
import javax.crypto.*;
public class CipherSample
{
    public static void main(String[]args)throws Exception
    {
        //Creating a Signature object
        Signature sign = Signature.getInstance("SHA256withRSA");
        //Creating KeyPair generator object
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        //Initializing the key pair generator
        keyPairGenerator.initialize(2048);
        //Generating the pair of keys
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        //Creating a Cipher object
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        //Initializing a Cipher object
        cipher.init(Cipher.ENCRYPT_MODE, keyPair.getPublic());
        //Adding data to the cipher
        byte[] bytes = "Welcome to TutorialsPoint".getBytes();
        cipher.update(bytes);
        //encrypting the data
        byte[] cipherText = cipher.doFinal();
        System.out.println(new String(cipherText, "UTF8"));
    }
}
