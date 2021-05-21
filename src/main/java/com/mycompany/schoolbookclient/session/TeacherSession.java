package com.mycompany.schoolbookclient.session;

import com.mycompany.schoolbookclient.data.ContentBuilder;
import com.mycompany.schoolbookclient.data.Mapper;
import com.mycompany.schoolbookclient.mainwindow.MainFrame;
import static com.mycompany.schoolbookclient.session.Session.id;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author marcin
 */
public class TeacherSession extends Session {
    public TeacherSession(String login, String pass) throws NoSuchAlgorithmException, IOException {
        super(login);
        running = ContentBuilder
                            .LogInResponse(Mapper
                                    .parseJSON(MainFrame.client
                                            .makeRequestLOG_INTeacher(id, pass)));
    }
}
