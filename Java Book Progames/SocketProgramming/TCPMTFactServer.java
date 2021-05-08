
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author hp
 */
public class TCPMTFactServer {

    public static void main(String[] args) throws IOException {
        ServerSocket welcomeSocket = new ServerSocket(3600);
        System.out.println("Server Ready");
        while (true) {
            Socket serverEnd = welcomeSocket.accept();
            System.out.println("Request accepted");
            //hand over this connection request to handler
            new Handler(serverEnd);
        }
    }
}

class Handler implements Runnable {

    Socket serverEnd;

    Handler(Socket s) {
        this.serverEnd = s;
        new Thread(this).start();
        System.out.println("A Thread Created");
    }

    public void run() {
        try {
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(serverEnd.getInputStream()));
            PrintWriter toClient = new PrintWriter(serverEnd.getOutputStream(), true);
            while (true) {
                int n = Integer.parseInt(fromClient.readLine());
                System.out.println("Received : " + n);
                if (n == -1) {
                    serverEnd.close();
                    break;
                }
                int fact = 1;
                for (int i = 2; i <= n; i++) {
                    fact *= i;
                }
                toClient.println(fact);
                System.out.println("Sent : " + fact);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
