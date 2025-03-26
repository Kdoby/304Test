package doby.hello_doby.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "테스트입니다.!!!!!!!";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "잘 가 React!";
    }
}
