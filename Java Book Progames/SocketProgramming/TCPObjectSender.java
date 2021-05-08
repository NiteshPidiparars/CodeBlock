import java.io.*;
import java.net.*;
public class TCPObjectSender
{
    public static void main(String[]args)throws Exception
    {
        Socket socket = new Socket("DESKTOP-N9QLGBV",3600);
        System.out.println("Connect to LocalHost at port 3600");
        Message message = new Message("Remainder","Return my book on Monday");
        //Create ObjectOutputStream object
        ObjectOutputStream obj = new ObjectOutputStream(socket.getOutputStream());
        //Serialize and send over TCP
        obj.writeObject(message);
        System.out.println("Sent an Object");
        socket.close();
    }
}
