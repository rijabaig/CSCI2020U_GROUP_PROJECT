package com.example.messengerclientend;

import javafx.scene.layout.VBox;

import java.io.*;

import java.net.Socket;

public class MsgClient {
//creating new socket
    private Socket myClientSocket;
    private BufferedReader myReader;
    private BufferedWriter myWriter;
    public MsgClient(Socket myClientSocket) {
        try {
//reading message
            this.myClientSocket = myClientSocket;
            this.myReader = new BufferedReader(new InputStreamReader(myClientSocket.getInputStream()));
            this.myWriter = new BufferedWriter(new OutputStreamWriter(myClientSocket.getOutputStream()));
        }catch (IOException exception){ //if unable to read 
            System.out.println("Could not create Client :(");
            exception.printStackTrace();
            eventCloser(myClientSocket, myReader, myWriter);
        }

    }
//this method sends a message to server
    public void sendServerMessage(String messageToBeSent){

        try{
            myWriter.write(messageToBeSent); //writing the message
            myWriter.newLine();
            myWriter.flush();
        }catch(IOException exception){
            exception.printStackTrace();
            System.out.println("Could not send the message :("); //exception if could not be read
            eventCloser(myClientSocket,myReader,myWriter);

        }

    }
    public void gotServerMessage(VBox myVbox){
        new Thread(new Runnable() {
            @Override
            public void run() { //run method
                while (myClientSocket.isConnected()){ //while loop for while client is connected 
                    try{
                        String toServerMessage = myReader.readLine();
                        ClientController.printMessageOnGUI(toServerMessage, myVbox); //while connected, message is being printed
                    }catch(IOException exception){
                        System.out.println("Could not receive the message :(");
                        exception.printStackTrace();
                        eventCloser(myClientSocket, myReader, myWriter); //calls eventCloser method
                        break;
                    }

                }
            }
        }).start();

    }

    public void eventCloser(Socket mySocket, BufferedReader myReader, BufferedWriter myWriter){
        try{
            if (mySocket != null){//closes socket
                mySocket.close();
            }
            if (myReader != null){ //closes reader
                myReader.close();
            }
            if(myWriter != null){ //closes writer
                myWriter.close();
            }

        }catch(IOException exception){
            exception.printStackTrace();
        }

    }
}
