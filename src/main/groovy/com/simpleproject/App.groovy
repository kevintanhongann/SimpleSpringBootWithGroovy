package com.simpleproject

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@EnableAutoConfiguration
class App {

    @RequestMapping("/")
    String home(){
        "Hello World!"
    }


}