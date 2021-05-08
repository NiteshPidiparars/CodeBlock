import java.security.*;
import java.io.*;
public class SignedObjectVerify
{
    public static void main(String[]args)throws Exception
    {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("os.dat"));
        SignedObject so = (SignedObject)ois.readObject();
        PublicKey pub = X509Certificate.getInstance(new FileInputStream("test.cer")).getPublicKey();
        Signature sign = Signature.getInstance(so.getAlgorithm());
        if(so.verify(pub, sign)){
            String s = (String)so.getObject();
            System.out.println(s);
        }
    }
}
