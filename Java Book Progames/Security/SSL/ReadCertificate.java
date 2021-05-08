import java.io.*;
import java.security.cert.*;
import java.util.*;
public class ReadCertificate
{
    public static void main(String[]args)throws Exception
    {
        CertificateFactory factory = CertificateFactory.getInstance("x.509");
        //Certificate c = factory.generateCertificate(new FileInputStream("C:/Users/hp/Desktop/Java Book Progames/Security/SSL/server.cer"));
        Collection c = factory.generateCertificate(new FileInputStream("C:/Users/hp/Desktop/Java Book Progames/Security/SSL/server.cer"));
        for(Iterator i = c.iterator();i.hasNext();)
             Certificate cert = (Certificate)i.next();
        System.out.println(cert);
    }
}
