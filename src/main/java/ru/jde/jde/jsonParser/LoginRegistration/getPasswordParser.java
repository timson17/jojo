package ru.jde.jde.jsonParser.LoginRegistration;

import org.json.JSONObject;

public class getPasswordParser {

    public  String ParserPassword(String json) {
        JSONObject jason = new JSONObject(json);
        return jason.getJSONObject("UserInfo").get("password").toString();
    }
}
