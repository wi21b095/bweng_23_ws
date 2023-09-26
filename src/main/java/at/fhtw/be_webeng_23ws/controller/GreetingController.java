package at.fhtw.be_webeng_23ws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/greeting")
    public String helloWorld(@RequestParam String name) {
//        int error = 1/0;
        return "Hallo, " + name;
    }
}
