package ru.jde.jde.jsonParser.AddNigger;

import org.json.JSONObject;

public class addNiggerOwnerId {
    public  Integer parseNiggerOwnerId(String json) {
        JSONObject jason = new JSONObject(json);
        return jason.getJSONObject("NewNiggerInfo").getInt("owner_id");
    }
}
