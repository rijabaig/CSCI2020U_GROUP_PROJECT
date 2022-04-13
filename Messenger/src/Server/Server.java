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
        try { // creating and opening a new server socket with port number 8889
            serverSocket = new ServerSocket(8889);
            while(true) {
                System.out.println("Waiting for clients...");
                socket = serverSocket.accept(); //waiting for client request on the host and port of this server
                System.out.println("Connected");
                ClientHandler clientThread = new ClientHandler(socket, clients); //creating new thread
                clients.add(clientThread); // adding client to thread
                clientThread.start();//starting thread
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
