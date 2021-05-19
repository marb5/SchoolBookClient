package com.mycompany.schoolbookclient.data;

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
}
