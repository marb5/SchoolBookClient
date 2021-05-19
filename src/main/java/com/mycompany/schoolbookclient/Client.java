package com.mycompany.schoolbookclient;

import com.mycompany.schoolbookclient.mainwindow.ConnectionErrorFrame;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
/**
 *
 * @author marcin
 */
public class Client extends Thread {
    private GetPropertyValues properties;
    private String serverHost;
    private int serverPort;
    private Socket socket;
    private BufferedReader buffer;
    private PrintWriter clientPrintOut;
    
    public Client() throws IOException {
        try {
            properties = new GetPropertyValues();
            serverHost = properties.getHost();
            serverPort = properties.getPort();

            socket = new Socket(serverHost, serverPort);
            
            buffer = new BufferedReader(
                        new InputStreamReader(
                            socket.getInputStream()));
            clientPrintOut = new PrintWriter(socket.getOutputStream(), true);
            
            }
        catch (IOException e) {
            new ConnectionErrorFrame();
        }
    }
    
    public boolean isConnectedSuccesfully() throws IOException {
        return buffer.readLine().equals("Connection was successful!");
    }

    public String makeRequest(String request) throws IOException {
        clientPrintOut.println(request);
        return buffer.readLine();
    }
    
    public String makeRequestGETStudentByID(int id) throws IOException {
        String request = "STU;GET;" + String.valueOf(id);
        clientPrintOut.println(request);
        return buffer.readLine();
    }
}
