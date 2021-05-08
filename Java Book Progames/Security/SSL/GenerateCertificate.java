import sun.security.x509.*;
import java.security.cert.*;
import java.security.*;
import java.math.BigInteger;
import java.util.*;
import java.io.*;
public class GenerateCertificate
{
    public static void main(String[]args)
    {
        try{
            String enAlg = "RSA", sigAlg = "SHA1with"+enAlg;
            KeyPairGenerator kpg = KeyPairGenerator.getInstance(enAlg);
            KeyPair kp = kpg.generateKeyPair();
            PrivateKey priv = kp.getPrivate();
            X509CertInfo ci = new X509CertInfo();
            ci.set(X509CertInfo.VERSION, new CertificateVersion(CertificateVersion.V3));
            BigInteger sn = new BigInteger(64, new SecureRandom());
            ci.set(X509CertInfo.SERIAL_NUMBER, new CertificateSerialNumber(sn));
            String dn = "CN=myName, OU=myOU, O=myO, L=myL, S=myS, C=myC";
            X500Name issuer = new X500Name(dn);
            ci.set(X509CertInfo.ISSUER, new CertificateIssuerName(issuer));
            Date from = new Date();
            Date to = new Date(from.getTime() + 365*24*60*60*10001);
            CertificateValidity duration = new CertificateValidity();
            ci.set(X509CertInfo.VALIDITY, duration);
            ci.set(X509CertInfo.SUBJECT, new CertificateSubjectName(issuer));
            ci.set(X509CertInfo.KEY, new CertificateX509Key(kp.getPublic()));
            AlgorithmId aid = new AlgorithmId(AlgorithmId.sha1WithRSAEncryption_oid);
            ci.set(X509CertInfo.ALGORITHM_ID, new CertificateAlgorithmId(aid));

            X509CertImpl cert = new X509CertImpl(ci);
            cert.sign(priv, sigAlg);

            FileOutputStream fout = new FileOutputStream("c.cer");
            fout.write(cert.getEncoded());
            fout.close();

            KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
            char[] password = "nitesh@19".toCharArray();
            ks.load(null, password);
            java.security.cert.Certificate[] chain = {cert};
            ks.setKeyEntry("abc", priv, password, chain);
            java.io.FileOutputStream fos = new java.io.FileOutputStream("c.jks");
            ks.store(fos, password);

            KeyStore ts = KeyStore.getInstance(KeyStore.getDefaultType());
            ks.load(null, password);
            ts.setCertificateEntry("abc", cert);
            java.io.FileOutputStream fos1 = new java.io.FileOutputStream("c.ts");
            ks.store(fos1, password);
        }catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
