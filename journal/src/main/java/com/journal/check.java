package com.journal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class check {
    @GetMapping("/ok")
    public String abc(){
        return "aaa";
    }
}
