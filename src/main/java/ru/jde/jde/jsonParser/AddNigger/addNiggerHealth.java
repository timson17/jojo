package ru.jde.jde.jsonParser.AddNigger;

import org.json.JSONObject;

public class addNiggerHealth {
    public  String parseNiggerHealth(String json) {
        JSONObject jason = new JSONObject(json);
        return jason.getJSONObject("NewNiggerInfo").get("health").toString();
    }
}
