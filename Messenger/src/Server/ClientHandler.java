package Server;

import Client.Controller;
import Client.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
//clienthandler class
public class ClientHandler extends Thread {

    private ArrayList<ClientHandler> clients;
    private Socket socket;
    private BufferedReader reader;
    private PrintWriter writer;
//constructor
    public ClientHandler(Socket socket, ArrayList<ClientHandler> clients) {
        try {
            this.socket = socket;
            this.clients = clients;
            this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.writer = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            String msg;
            while ((msg = reader.readLine()) != null) {
                if (msg.equalsIgnoreCase( "exit")) { //if recieved exit from client, exit
                    break;
                } 
                for (ClientHandler cl : clients) {
                    cl.writer.println(msg); //user writes message
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally { //closing resources
            try {
                reader.close();
                writer.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
