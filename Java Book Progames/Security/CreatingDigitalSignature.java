import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.Signature;
import java.util.Scanner;
public class CreatingDigitalSignature
{
    public static void main(String[]args)throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Some Text : ");
        String msg = sc.nextLine();
        //Creating KeyPair generator object
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("DSA");
        //Initializing the key pair generator
        keyPairGen.initialize(2048);
        //Generating pair of key
        KeyPair pair = keyPairGen.generateKeyPair();
        //generating the private key from the key pair
        PrivateKey privKey = pair.getPrivate();
        //Creating the signature object
        Signature sign = Signature.getInstance("SHA256withDSA");
        //initializing the signature
        sign.initSign(privKey);
        byte[] bytes = "msg".getBytes();
        //adding data to the signature
        sign.update(bytes);
        //calculating the signature
        byte[] signature = sign.sign();
        //printing the signature
        System.out.println("Digital signature for given text : "+new String(signature, "UTF8"));
    }
}
