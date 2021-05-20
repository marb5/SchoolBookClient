package com.mycompany.schoolbookclient.data;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author marcin
 */
public class ContentBuilder {
    public static String ChangeAddressResponse(Map<String, String> map) {
        if (map.get("Success") == "1")
            return "Address changed correctly\n";
        else
            return "Problem while changing address\n";
    }
    
    public static String StudentPersonalData(Map<String, String> map) {
        String data = "";
        data += "Id: " + map.get("Id") + "\n";
        data += "First name: " + map.get("First name") + "\n";
        data += "Last name: " + map.get("Last name") + "\n";
        data += "Birth date: " + map.get("Date") + "\n";
        data += "Class number: " + map.get("Class number") + "\n";
        data += "City: " + map.get("City") + "\n";
        data += "Address: " + map.get("Street and number") + "\n";
        data += "Post code: " + map.get("Post code") + "\n";

        return data;
    }
    
    public static String StudentGrades(ArrayList<Map<String, String>> list) {
        if (list != null) {
            String data = "Your grades:\n";
            for (int i = 0; i < list.size(); ++i) {
                data += "Subject name: " + list.get(i).get("Subject name") + "\n";
                data += "Grade: " + list.get(i).get("Grade") + "\n";
            }

            return data;
        }
        else
            return "";
    }
    
    public static String StudentGradeFrom(Map<String, String> map) {
        if (map != null) {
            String data = "Your grades:\n";
            data += "Subject name: " + map.get("Subject name") + "\n";
            data += "Grade: " + map.get("Grade") + "\n";

            return data;
        }
        else
            return "";
    }
    
    public static String TeacherPersonalData(Map<String, String> map) {
        String data = "";
        data += "Id: " + map.get("Id") + "\n";
        data += "First name: " + map.get("First name") + "\n";
        data += "Last name: " + map.get("Last name") + "\n";
        data += "Birth date: " + map.get("Date") + "\n";
        data += "City: " + map.get("City") + "\n";
        data += "Address: " + map.get("Street and number") + "\n";
        data += "Post code: " + map.get("Post code") + "\n";

        return data;
    }
    
    public static String TeachersStudentsGrades(ArrayList<Map<String, String>> list) {
        if (list != null) {
            String data = "Your students grades:\n";
            for (int i = 0; i < list.size(); ++i) {
                data += "Subject name: " + list.get(i).get("Subject name") + "\n";
                data += "Grade: " + list.get(i).get("Grade") + "\n";
                data += "Student's id: " + list.get(i).get("StudentId") + "\n";
                data += "Student's first name: " + list.get(i).get("Student firstName") + "\n";
                data += "Student's last name: " + list.get(i).get("Student lastName") + "\n";
            }

            return data;
        }
        else
            return "";
    }
    
    public static String TeachersStudentsGradesFrom(ArrayList<Map<String, String>> list) {
        if (list != null) {
            String data = "Your students grades:\n";
            for (int i = 0; i < list.size(); ++i) {
                data += "Subject name: " + list.get(i).get("Subject name") + "\n";
                data += "Grade: " + list.get(i).get("Grade") + "\n";
                data += "Student's id: " + list.get(i).get("StudentId") + "\n";
                data += "Student's first name: " + list.get(i).get("Student firstName") + "\n";
                data += "Student's last name: " + list.get(i).get("Student lastName") + "\n";
            }

            return data;
        }
        else
            return "";
    }
    
    public static String AddGradeResponse(Map<String, String> map) {
        if (map.get("Success").equals("1"))
            return "Grade added correctly\n";
        else
            return "Problem while adding grade\n";
    }
    
    public static String ChangeGradeResponse(Map<String, String> map) {
        if (map.get("Success").equals("1"))
            return "Grade changed correctly\n";
        else
            return "Problem while changing grade\n";
    }
    
    public static String DeleteGradeResponse(Map<String, String> map) {
        if (map.get("Success").equals("1"))
            return "Grade deleted correctly\n";
        else
            return "Problem while deleting grade\n";
    }
    
    public static boolean LogInResponse(Map<String, String> map) {
        if (map.get("Success").equals("1"))
            return true;
        else
            return false;
    }
}
