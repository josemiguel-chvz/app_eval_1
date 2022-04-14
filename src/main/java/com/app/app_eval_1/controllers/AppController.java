package com.app.app_eval_1.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    
    @GetMapping("/")
    public Map<String, String> index2() {
        HashMap<String, String> response = new HashMap<>();
        response.put("response","Aplicación web muy simple");
        return response;
    }
}
