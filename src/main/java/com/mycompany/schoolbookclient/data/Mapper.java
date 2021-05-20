package com.mycompany.schoolbookclient.data;

import java.util.ArrayList;
import java.util.Map;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 *
 * @author marcin
 */
public class Mapper {
    public static Map<String, String> parseJSON(String jsonStr) {
        JSONObject obj = (JSONObject)JSONValue.parse(jsonStr);
        return obj;
    }
    
    public static ArrayList<Map<String, String>>  parseJSONlist(String jsonStr) {
        JSONObject obj = (JSONObject)JSONValue.parse(jsonStr);
        ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
        for (int i = 0; i < obj.size(); ++i)
            list.add((Map<String, String>) obj.get(i));
        return list;
    }
}
