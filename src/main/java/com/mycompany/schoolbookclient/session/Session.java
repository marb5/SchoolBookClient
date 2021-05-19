package com.mycompany.schoolbookclient.session;

/**
 *
 * @author marcin
 */
public class Session {
    protected boolean running;
    protected static int id;
    
    Session(String login) {
        try {
            id = Integer.parseInt(login.substring(1));
            running = true;
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
