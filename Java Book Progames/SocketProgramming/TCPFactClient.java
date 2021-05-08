import java.io.*;
import java.net.*;
public class TCPFactClient
{
    public static void main(String[]args)throws Exception
    {
        String fact;
        Socket socket = new Socket("DESKTOP-N9QLGBV",8080);
        System.out.println("Connected to LocalHost at port 8080");
        PrintWriter pr = new PrintWriter(socket.getOutputStream(),true);
        BufferedReader fromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Integer : ");
        String n = fromUser.readLine();
        pr.println(n);
        System.out.println("Sent to Server : "+n);
        fact = fromServer.readLine();
        System.out.println("Received from Server : "+fact);
        socket.close();
    }
}
