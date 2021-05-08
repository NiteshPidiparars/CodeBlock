import java.io.*;
import java.net.*;
public class MailClient
{
    public static void main(String[]args)throws Exception
    {
        int port = Integer.parseInt("25");
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        Socket clientSocket = new Socket("smtp.gmail.com",port);
        if(clientSocket == null){
            System.out.println("Error Connection");
        }
        else{
            System.out.println("Connection to the server "+"DESKTOP-N9QLGBV"+" at the port "+port);
            DataOutputStream outStream = new DataOutputStream(clientSocket.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String[] out = {"HELO : thinkpad\n", "mail from : <niteshpidiparas76@gmail.com>\n", "rcpt to : <niteshpidiparas76@gmail.com>\n",
                            "data\n","This is a Simple Mail\n","quit\n"};
            try{
                System.out.println("From Server : "+inFromServer.readLine());
                for(int i=0;i<out.length;i++){
                    outStream.writeBytes(out[i]);
                    System.out.println("To Server : "+out[i]);
                    System.out.println("From Server : "+inFromServer.readLine());
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
