import java.security.*;
public class KeyPairGenertor
{
    public static void main(String[]args)throws Exception
    {
        //Creating KeyPair generator object
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("DSA");
        //Initializing the KeyPairGenerator
        keyPairGen.initialize(2048);
        //Generating the pair of Key
        KeyPair keyPair = keyPairGen.generateKeyPair();
        //Generating the Private Key from keyPair
        PrivateKey privKey = keyPair.getPrivate();
        //Generating the public key from key Pair
        PublicKey pubKey = keyPair.getPublic();
        System.out.println("Keys Generated");
    }
}
