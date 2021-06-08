package com.mycompany.schoolbookclient;

import com.mycompany.schoolbookclient.mainwindow.ConnectionErrorFrame;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;
/**
 *
 * @author marcin
 */
//makes connection with database, processes requests and responses
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
    
    public String makeRequestGETStudentByIDGrades(int id) throws IOException {
        String request = "STU;GET;GRA;" + String.valueOf(id);
        clientPrintOut.println(request);
        return buffer.readLine();
    }
    
    public String makeRequestGETStudentByIDGradesFrom(int myId, int subjectId) throws IOException {
        String request = "STU;GET;" + String.valueOf(myId) + ";" + String.valueOf(subjectId);
        clientPrintOut.println(request);
        return buffer.readLine();
    }
    
    public String makeRequestCHANGEStudentAddress(int myId, String city, String address, String postCode) throws IOException {
        String request = "STU;CHA;" + String.valueOf(myId) + ";" + city + ";" + address + ";" + postCode;
        clientPrintOut.println(request);
        return buffer.readLine();
    }
    
    public String makeRequestGETTeacherByID(int id) throws IOException {
        String request = "TEA;GET;" + String.valueOf(id);
        clientPrintOut.println(request);
        return buffer.readLine();
    }
    
    public String makeRequestGETTeachersAllStudentsGrades(int id) throws IOException {
        String request = "TEA;GET;GRA;" + String.valueOf(id);
        clientPrintOut.println(request);
        return buffer.readLine();
    }
    
    public String makeRequestGETTeachersStudentsGradesFrom(int myId, int subjectId) throws IOException {
        String request = "TEA;GET;" + String.valueOf(myId) + ";" + String.valueOf(subjectId);
        clientPrintOut.println(request);
        return buffer.readLine();
    }
    
    public String makeRequestCHANGETeacherAddress(int myId, String city, String address, String postCode) throws IOException {
        String request = "TEA;CHA;" + String.valueOf(myId) + ";" + city + ";" + address + ";" + postCode;
        clientPrintOut.println(request);
        return buffer.readLine();
    }
    
    public String makeRequestADDGrade(int myId, int studentId, int subjectId, int grade) throws IOException {
        String request = "TEA;ADD;" + String.valueOf(myId) + ";" + String.valueOf(studentId) + ";"
                                    + String.valueOf(subjectId) + ";" + String.valueOf(grade);
        clientPrintOut.println(request);
        return buffer.readLine();
    }
    
    public String makeRequestCHANGEGrade(int myId, int studentId, int subjectId, int grade) throws IOException {
        String request = "TEA;CHA;" + String.valueOf(myId) + ";" + String.valueOf(studentId) + ";"
                                    + String.valueOf(subjectId) + ";" + String.valueOf(grade);
        clientPrintOut.println(request);
        return buffer.readLine();
    }
    
    public String makeRequestDELETEGrade(int myId, int studentId, int subjectId) throws IOException {
        String request = "TEA;DEL;" + String.valueOf(myId) + ";" + String.valueOf(studentId) + ";"
                                    + String.valueOf(subjectId);
        clientPrintOut.println(request);
        return buffer.readLine();
    }
    
    public String makeRequestLOG_INStudent(int id, String pass) throws NoSuchAlgorithmException, IOException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(pass.getBytes());
        String passMD5 = DatatypeConverter.printHexBinary(md5.digest());
        String request = "STU;LOG;" + String.valueOf(id) + ";" + passMD5 + ";";
        clientPrintOut.println(request);
        return buffer.readLine();
    }
    
    public String makeRequestLOG_INTeacher(int id, String pass) throws NoSuchAlgorithmException, IOException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(pass.getBytes());
        String passMD5 = DatatypeConverter.printHexBinary(md5.digest());
        String request = "TEA;LOG;" + String.valueOf(id) + ";" + passMD5 + ";";
        clientPrintOut.println(request);
        return buffer.readLine();
    }
    
    public void makeRequestExitConnection() {
        clientPrintOut.println("END;");
    }
}
