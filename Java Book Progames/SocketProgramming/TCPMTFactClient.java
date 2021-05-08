/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author hp
 */
public class TCPMTFactClient {
    public static void main(String[]args) throws IOException{
        String fact;
        Socket clientEnd = new Socket("DESKTOP-N9QLGBV", 3600);
        System.out.println("Connected to LocalHost at port 3600");
        PrintWriter toServer = new PrintWriter(clientEnd.getOutputStream(),true);
        BufferedReader fromServer = new BufferedReader(new InputStreamReader(clientEnd.getInputStream()));
        BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Enter the Integer : ");
            String n = fromUser.readLine();
            toServer.println(n);
            System.out.println("Sent to Server : "+n);
            if(n.equals("-1"))
                break;
            fact = fromServer.readLine();
            System.out.println("Received form Server : "+fact);
        }
    }
}
