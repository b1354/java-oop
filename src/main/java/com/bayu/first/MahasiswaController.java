package com.bayu.first;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MahasiswaController {
    @GetMapping("/hello")
    public String getMethodName() {
        return "Hello world";
    }
}
