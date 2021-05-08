import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Signature;
import javax.crypto.Cipher;
public class CipherDecrypt
{
    public static void main(String[]args)throws Exception
    {
        Signature sign = Signature.getInstance("SHA256withRSA");
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        //PublicKey pubKey = keyPair.getPublic();
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE,keyPair.getPublic());
        byte[] bytes = "Welcome to TutorialPoint".getBytes();
        cipher.update(bytes);
        byte[] cipherText = cipher.doFinal();
        System.out.println("Encrypted Text : ");
        System.out.println(new String(cipherText,"UTF8"));
        //Initializing the same cipher for decryption
        cipher.init(Cipher.DECRYPT_MODE,keyPair.getPrivate());
        //Decrypting the text
        byte[] decipheredText = cipher.doFinal(cipherText);
        System.out.println("Decrypted Text : ");
        System.out.println(new String(decipheredText));
    }
}
