package ru.jde.jde.tool;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import ru.jde.jde.jsonParser.getEmailParser;
import ru.jde.jde.jsonParser.getPasswordParser;
import ru.jde.jde.postgresql_methods.createUser;

@SpringBootApplication
@RestController
public class Tools {

    @PostMapping("/registration") //Мапинг регистрации нового пользователя
    public String registrationUser(@RequestBody String json) {
        String email = new getEmailParser().ParserEmail(json); //парсим имейл из джейсон
        String password = new getPasswordParser().ParserPassword(json); //парсим пароль из джейсон
        createUser user = new createUser();
        return user.addUserToDatabase(email, password);
    }
}
