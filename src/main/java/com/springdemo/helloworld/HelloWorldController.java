package com.springdemo.helloworld;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @RequestMapping
    public String helloWorld(){
        return "Hello World from Spring Boot";
    }
    @RequestMapping("/goodbye")
    public String Goodbye(){
        return "Goodbye from Spring Boot";
    }

//    @RequestMapping(value = "/getCityName", method = RequestMethod.GET)
    @GetMapping("/getCityName")
    public String getCityName(){
        return "Delhi";
    }


//    @RequestMapping(value = "/getCityName", method = RequestMethod.GET)
    @PostMapping("/getCityLocation")
    public String getCityLocation(){
        return "Sarojini";
    }

}
