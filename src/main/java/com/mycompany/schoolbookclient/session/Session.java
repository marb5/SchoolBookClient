package com.mycompany.schoolbookclient.session;

import com.mycompany.schoolbookclient.data.ContentBuilder;
import com.mycompany.schoolbookclient.data.Mapper;
import com.mycompany.schoolbookclient.mainwindow.MainFrame;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author marcin
 */
public class Session {
    protected boolean running;
    protected static int id;
    
    Session(String login, String pass) throws NoSuchAlgorithmException, IOException {
        try {
            id = Integer.parseInt(login.substring(1));
            running = ContentBuilder
                            .LogInResponse(Mapper
                                    .parseJSON(MainFrame.client
                                            .makeRequestLOG_INStudent(id, pass)));
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
