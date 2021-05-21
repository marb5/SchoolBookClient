package com.mycompany.schoolbookclient.session;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author marcin
 */
//informs about session
public class Session {
    protected boolean running;
    protected static int id;
    
    Session(String login) throws NoSuchAlgorithmException, IOException {
        try {
            id = Integer.parseInt(login.substring(1));
        }
        catch (NumberFormatException e) {
            running = false;
        }
    }

    public boolean isRunning() {
        return running;
    }
    
    public static int getId() {
        return id;
    }
}
