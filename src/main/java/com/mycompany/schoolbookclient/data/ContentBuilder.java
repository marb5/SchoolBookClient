package com.mycompany.schoolbookclient.data;

import java.util.Map;

/**
 *
 * @author marcin
 */
public class ContentBuilder {
    public static String StudentPersonalData(Map<String, String> map) {
        String data = "Id: " + map.get("Id") + "\n";
        data += "First name: " + map.get("First name") + "\n";
        data += "Last name: " + map.get("Last name") + "\n";
        data += "Birth date: " + map.get("Date") + "\n";
        data += "Post code: " + map.get("Post code") + "\n";
        data += "City: " + map.get("City") + "\n";
        data += "Address: " + map.get("Street and number") + "\n";
        data += "Post code: " + map.get("Post code") + "\n";
        
        return data;
    }
}
