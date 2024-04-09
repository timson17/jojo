package ru.jde.jde.jsonParser.LoginRegistration;

import org.json.JSONObject;

public class getFirstName {
    public  String ParserFirstName(String json) {
        JSONObject jason = new JSONObject(json);
        return jason.getJSONObject("UserInfo").get("first_name").toString();
    }
}
