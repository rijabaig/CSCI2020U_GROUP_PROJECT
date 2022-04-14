package Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    private static ArrayList<ClientHandler> clients = new ArrayList<ClientHandler>();

    public static void main(String[] args) {
        ServerSocket serverSocket;
        Socket socket;
        try {
            serverSocket = new ServerSocket(8889);
            while(true) {
                System.out.println("Lets connect the clients");
                socket = serverSocket.accept();
                System.out.println("Client Connected");
                ClientHandler clientThread = new ClientHandler(socket, clients);
                clients.add(clientThread);
                clientThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
