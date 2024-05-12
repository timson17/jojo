package ru.jde.jde.jsonParser.AddNigger;

import org.json.JSONObject;

public class addNiggerPower {
    public  Integer parseNiggerPower(String json) {
        JSONObject jason = new JSONObject(json);
        return Integer.valueOf(jason.getJSONObject("NewNiggerInfo").get("power").toString());
    }
}
