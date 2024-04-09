package ru.jde.jde.jsonParser.AddNigger;

import org.json.JSONObject;

public class addNigger {
    public  String addNewNigger(String json) {
        JSONObject jason = new JSONObject(json);
        return jason.getJSONObject("NewNiggerInfo").get("name").toString();
    }
}
