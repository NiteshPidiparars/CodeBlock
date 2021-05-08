import java.io.*;
import java.net.*;
public class TCPFactServer
{
    public static void main(String[]args)throws Exception
    {
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Server is listening port 8080");
        Socket socket = serverSocket.accept();
        System.out.println("Requested Accepted");
        BufferedReader fromClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter pr = new PrintWriter(socket.getOutputStream(),true);
        int n = Integer.parseInt(fromClient.readLine());
        System.out.println("Received from Client : "+n);
        int fact = 1;
        for(int i=2;i<=n;i++)
            fact *= i;
            pr.println(fact);
        System.out.println("Sent to Client : "+fact);
    }
}
