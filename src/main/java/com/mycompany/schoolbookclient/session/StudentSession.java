package com.mycompany.schoolbookclient.session;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author marcin
 */
public class StudentSession extends Session {
    public StudentSession(String login, String pass) throws NoSuchAlgorithmException, IOException {
        super(login, pass);
    }
}
