package com.lauramititelu.springboot.drugstore.DrugStore.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AboutController {

    @Value("${app.version}")
    private String appVersion;

    @Value("${app.creator}")
    private String  appCreator;

    @GetMapping("/")
    //@RequestMapping("/drugstore/about")
    public Map getInfo(){
        Map map = new HashMap<String, String>();
        map.put("App version", appVersion);
        map.put("App creator", appCreator);
        return map;
    }

}
