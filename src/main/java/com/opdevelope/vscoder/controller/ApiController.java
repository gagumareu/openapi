package com.opdevelope.vscoder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;



@Controller
@Log4j2
public class ApiController {

    @GetMapping("/test1")
    public String test1() {
        
        log.info("get api/test1");

        return "/test/test1";
    }
    
    @GetMapping("/library")
    public String getMethodName() {
        return "/library/library";
    }

    @GetMapping("/library2")
    public String getMethodName2() {
        return "/library/library2";
    }

    @GetMapping("/library3")
    public String getMethodName3() {
        return "/library/library3";
    }
    
    
}
