package com.mycompany.schoolbookclient.session;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author marcin
 */
public class TeacherSession extends Session {
    public TeacherSession(String login, String pass) throws NoSuchAlgorithmException, IOException {
        super(login, pass);
    }
}
