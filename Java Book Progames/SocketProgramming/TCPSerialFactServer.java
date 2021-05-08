import java.io.*;
import java.net.*;
public class TCPSerialFactServer
{
    public static void main(String[]args)throws Exception
    {
        ServerSocket serverSocket = new ServerSocket(8080);
        while(true){
            System.out.println("Server Listening on port 8080");
            Socket socket = serverSocket.accept();
            System.out.println("Request accepted");
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter toClient = new PrintWriter(socket.getOutputStream(),true);
            int n = Integer.parseInt(fromClient.readLine());
            System.out.println("Received from Client : "+n);
            int fact = 1;
            for(int i=2;i<=n;i++)
                fact *= i;
            toClient.println(fact);
            System.out.println("Sent to Client : "+fact);
        }
    }
}
