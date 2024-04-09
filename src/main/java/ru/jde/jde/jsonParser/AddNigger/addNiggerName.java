package ru.jde.jde.jsonParser.AddNigger;

import org.json.JSONObject;

public class addNiggerName {
    public  String parseNiggerName(String json) {
        JSONObject jason = new JSONObject(json);
        return jason.getJSONObject("NewNiggerInfo").get("name").toString();
    }
}
