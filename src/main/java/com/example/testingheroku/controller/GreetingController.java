package com.example.testingheroku.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
  @author   george
  @project   testingheroku
  @class  GreetingController
  @version  1.0.0 
  @since 21.04.2021 - 11.46
*/
@RestController
public class GreetingController {

    @RequestMapping("/hi")
    String getHello(){
        return "<h1>HELLO !!!</h1>";
    }
}
