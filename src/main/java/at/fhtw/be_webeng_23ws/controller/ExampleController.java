package at.fhtw.be_webeng_23ws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/example")
    public String getExample() {
        return "Hello, World!";
    }
}
