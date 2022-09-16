package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @RequestMapping("/")
    public String index(){
        return "<b>Hello From BridgeLabz</b>";
    }
}
