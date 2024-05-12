package ru.jde.jde.jsonParser.AddNigger;

import org.json.JSONObject;

public class addNiggerEvasion {
    public  Integer parseNiggerEvasion(String json) {
        JSONObject jason = new JSONObject(json);
        return Integer.valueOf(jason.getJSONObject("NewNiggerInfo").get("evasion").toString());
    }
}
