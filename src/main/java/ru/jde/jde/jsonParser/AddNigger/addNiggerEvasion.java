package ru.jde.jde.jsonParser.AddNigger;

import org.json.JSONObject;

public class addNiggerEvasion {
    public  String parseNiggerEvasion(String json) {
        JSONObject jason = new JSONObject(json);
        return jason.getJSONObject("NewNiggerInfo").get("evasion").toString();
    }
}
