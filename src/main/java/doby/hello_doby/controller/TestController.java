package doby.hello_doby.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/test")
    public String test() throws Exception{

        return "안녕 React? 하이asd";
    }
}
