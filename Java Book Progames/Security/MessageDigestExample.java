import java.security.MessageDigest;
import java.util.Scanner;
public class MessageDigestExample
{
    public static void main(String[]args)throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Message : ");
        String message = sc.nextLine();
        //creating the MessageDigest Object
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(message.getBytes());//passing the data to created message digest object
        byte[] digest = md.digest();//compute the message digest
        System.out.println(digest);
        //converting the byte array into HexString format
        StringBuffer hexString = new StringBuffer();
        for(int i=0;i<digest.length;i++){
            hexString.append(Integer.toHexString(0xFF & digest[i]));
        }
        System.out.println("Hex Format : "+hexString.toString());
    }
}
