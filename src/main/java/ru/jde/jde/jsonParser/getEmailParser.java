package ru.jde.jde.jsonParser;

import org.json.JSONObject;

public class getEmailParser {

    public  String ParserEmail(String json) {
        JSONObject jason = new JSONObject(json);
        return jason.getJSONObject("UserInfo").get("email").toString();
    }
    public  String ParserPassword(String json) {
        JSONObject jason = new JSONObject(json);
        return jason.getJSONObject("UserInfo").get("email").toString();
    }
}
