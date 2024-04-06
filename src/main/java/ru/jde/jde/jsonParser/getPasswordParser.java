package ru.jde.jde.jsonParser;

import org.json.JSONObject;

public class getPasswordParser {

    public  String ParserPassword(String json) {
        JSONObject jason = new JSONObject(json);
        return jason.getJSONObject("UserInfo").get("password").toString();
    }
}
