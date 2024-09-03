package africa.semicolon.facegate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ApplicationController {
    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello Joshua nice trick!  ";
    }
}
