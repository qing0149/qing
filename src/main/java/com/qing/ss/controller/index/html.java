package com.qing.ss.controller.index;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class html {
    @GetMapping("/index")
    public String s(){
        return "hh";
    }

}
