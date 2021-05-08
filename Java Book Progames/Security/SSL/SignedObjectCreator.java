import java.security.*;
import java.io.*;
public class SignedObjectCreator
{
    public static void main(String[]args)throws Exception
    {
        char[] password = "nitesh@19".toCharArray();
        KeyStore ks = KeyStore.getInstance("JKS");
        ks.load(new FileInputStream("C:/Users/hp/Desktop/Java Book Progames/Security/SSL/test.ks"), password);
        String str = "Hello World!!";
        PrivateKey pri = (PrivateKey)ks.getKey("test", password);
        Signature sign = Signature.getInstance("SHA1withRSA");
        SignedObject so = new SignedObject(str, pri, sign);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("so.dat"));
        out.writeObject(so);
    }
}
