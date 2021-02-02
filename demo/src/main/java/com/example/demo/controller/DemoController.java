package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author LD
 * @date 2021/2/2 - 16:26
 **/
@Controller
public class DemoController {
    @GetMapping("/demo")
    @ResponseBody
    public String setHello(){
        return "hello world !";
    }
}
