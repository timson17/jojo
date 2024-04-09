package ru.jde.jde.jsonParser.AddNigger;

import org.json.JSONObject;

public class addNiggerOwnerId {
    public  String parseNiggerOwnerId(String json) {
        JSONObject jason = new JSONObject(json);
        return jason.getJSONObject("NewNiggerInfo").get("owner_id").toString();
    }
}
