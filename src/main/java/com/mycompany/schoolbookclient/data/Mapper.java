package com.mycompany.schoolbookclient.data;

import java.util.ArrayList;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

/**
 *
 * @author marcin
 */
//parses json from server to readable data
public class Mapper {
    public static Map<String, String> parseJSON(String jsonStr) {
        if (jsonStr.equals("{\"Error\":\"Problem with server!\"}")) {
            return null;
        }
        JSONObject obj = (JSONObject)JSONValue.parse(jsonStr);
        return obj;
    }
    
    public static ArrayList<Map<String, String>>  parseJSONlist(String jsonStr) {
        if (jsonStr.equals("{\"Error\":\"Problem with server!\"}")) {
            return null;
        }
        JSONArray array = (JSONArray)JSONValue.parse(jsonStr);
        return array;
    }
}
