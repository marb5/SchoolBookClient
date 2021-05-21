package com.mycompany.schoolbookclient;

import com.mycompany.schoolbookclient.mainwindow.ConnectionErrorFrame;
import com.mycompany.schoolbookclient.mainwindow.MainFrame;
import java.io.IOException;
import java.net.ConnectException;

/**
 *
 * @author marcin
 */
public class App {//implements Runnable {
    
    //runs application
    public static void main(String[] args) throws ConnectException, IOException {
        Client client = new Client();
        if (client.isConnectedSuccesfully()) {
            MainFrame myFrame = new MainFrame(client);
            myFrame.main(args);
        }
        else {
            new ConnectionErrorFrame();
        }
    }  
    
}
