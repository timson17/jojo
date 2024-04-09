package ru.jde.jde.jsonParser.AddNigger;

import org.json.JSONObject;

public class addNiggerPower {
    public  String parseNiggerPower(String json) {
        JSONObject jason = new JSONObject(json);
        return jason.getJSONObject("NewNiggerInfo").get("power").toString();
    }
}
