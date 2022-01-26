package com.hr.site.pari;

import java.util.ArrayList;
import java.util.List;

import com.hr.data.User;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RestControllerEx {
    

    @GetMapping("/users")
    public List<User> getUsers() {

        List <User>  result =  new ArrayList<>();
         result.add(new User(1, "toto", "prenom"));
         result.add(new User(2, "tata", "prenom"));
        return result;
    }

}
