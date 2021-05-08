import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.Signature;
import java.util.Scanner;
public class SignatureVerification
{
    public static void main(String[]args)throws Exception
    {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PrivateKey privKey = keyPair.getPrivate();
        Signature sign = Signature.getInstance("SHA256withDSA");
        sign.initSign(privKey);
        byte[] bytes = "Hello how are you".getBytes();
        sign.update(bytes);
        byte[] signature = sign.sign();

        //Initializing the signature
        sign.initVerify(keyPair.getPublic());
        sign.update(bytes);
        //Verifying the signature
        boolean bool = sign.verify(signature);
        if(bool){
            System.out.println("Signature Verified");
        }else{
            System.out.println("Signature Failed");
        }
    }
}
