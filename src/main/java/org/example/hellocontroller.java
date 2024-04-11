package org.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
    @RequestMapping("/hello")
    public String sayHi(){
        java.lang.String s ="Hello world";
        return s;
    }
}
