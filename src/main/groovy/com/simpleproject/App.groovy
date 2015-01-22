package com.simpleproject

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@EnableAutoConfiguration
@ComponentScan
class App {

    @RequestMapping("/")
    String home(){
        "Hello World!"
    }


    @RequestMapping("/testjson")
    String jsonOutputTest(){

    }


}