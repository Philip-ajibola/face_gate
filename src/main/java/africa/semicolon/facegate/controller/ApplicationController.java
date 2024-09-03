package africa.semicolon.facegate.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApplicationController {
    @PostMapping(value = "/")
    public String hello() {
        return "Hello Joshua nice trick!  ";
    }
}
