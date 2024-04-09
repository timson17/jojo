package ru.jde.jde.tool;

import org.springframework.web.bind.annotation.*;
import ru.jde.jde.postgresql_methods.authChecker;
import ru.jde.jde.hashgen.HashGenerator;
import ru.jde.jde.postgresql_methods.emailChecker;
import ru.jde.jde.jsonParser.LoginRegistration.getEmailParser;
import ru.jde.jde.jsonParser.LoginRegistration.getFirstName;
import ru.jde.jde.jsonParser.LoginRegistration.getLastName;
import ru.jde.jde.jsonParser.LoginRegistration.getPasswordParser;
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

    @PostMapping("/auth") //Мапинг авторизации
    public String authUser(@RequestBody String json) {
        String email = new getEmailParser().ParserEmail(json);
        String password = new getPasswordParser().ParserPassword(json);
        String hashPswd = new HashGenerator().hashing(password);
        boolean res = new authChecker().checkAuth(email,hashPswd);
        return res + " " +"попытка авторизации";
    }

    @GetMapping("/main_page")
    public String mainPage(@RequestParam("first_name") String paramValue) {
        return "Hello" + paramValue;
    }

    @PostMapping("/addNigger")
    public String addNigger(@RequestBody String json) {
        return "";
    }

}
