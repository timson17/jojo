package ru.jde.jde.jsonParser.AddNigger;

import org.json.JSONObject;

public class addNiggerHealth {
    public Integer parseNiggerHealth(String json) {
        JSONObject jason = new JSONObject(json);
        return jason.getJSONObject("NewNiggerInfo").getInt("health");
    }
}
