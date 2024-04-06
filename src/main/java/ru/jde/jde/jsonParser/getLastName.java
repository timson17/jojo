package ru.jde.jde.jsonParser;

import org.json.JSONObject;

public class getLastName {
    public  String ParserLastName(String json) {
        JSONObject jason = new JSONObject(json);
        return jason.getJSONObject("UserInfo").get("last_name").toString();
    }
}
