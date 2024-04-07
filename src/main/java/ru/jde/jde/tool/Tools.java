package ru.jde.jde.tool;

import org.springframework.web.bind.annotation.*;
import ru.jde.jde.hashgen.HashGenerator;
import ru.jde.jde.hashgen.emailChecker;
import ru.jde.jde.jsonParser.getEmailParser;
import ru.jde.jde.jsonParser.getFirstName;
import ru.jde.jde.jsonParser.getLastName;
import ru.jde.jde.jsonParser.getPasswordParser;
import ru.jde.jde.postgresql_methods.createUser;

@RestController
public class Tools {

    @PostMapping("/registration") //Мапинг регистрации нового пользователя
    public String registrationUser(@RequestBody String json) {
        String email = new getEmailParser().ParserEmail(json); //парсим имейл из джейсон
        String password = new getPasswordParser().ParserPassword(json); //парсим пароль из джейсон
        String firstname = new getFirstName().ParserFirstName(json); //
        String lastname = new getLastName().ParserLastName(json);
        createUser user = new createUser();
        String hashpswd = new HashGenerator().hashing(password);
        boolean emlCheck = new emailChecker().checkEmail(email);
        if (!emlCheck) {
            return user.addUserToDatabase(email, hashpswd, firstname, lastname);
        }
        else return "Электронная почта уже используется";

    }
}
