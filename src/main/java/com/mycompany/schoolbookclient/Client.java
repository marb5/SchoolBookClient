package com.mycompany.schoolbookclient;

import java.io.IOException;

/**
 *
 * @author marcin
 */
public class Client {
    public static void connectToServer() throws IOException {
        GetPropertyValues properties = new GetPropertyValues();
        String serverHost = properties.getHost();
        int serverPort = properties.getPort();
        
        System.out.println(serverHost + ":" + serverPort);
    }
}
