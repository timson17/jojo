package ru.jde.jde.jsonParser.LoginRegistration;

import org.json.JSONObject;

public class getEmailParser {

    public  String ParserEmail(String json) {
        JSONObject jason = new JSONObject(json);
        return jason.getJSONObject("UserInfo").get("email").toString();
    }
}
