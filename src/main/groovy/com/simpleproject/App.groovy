package com.simpleproject

import com.simpleproject.domain.Person
import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView


@RestController
@EnableAutoConfiguration
@ComponentScan
class App {

    @RequestMapping("/")
    def home(){
        /*new ModelAndView(
                "views/main",
                [bootVersion: Banner.package.implementationVersion,
                 groovyVersion: GroovySystem.version])*/
        new ModelAndView("views/home")
    }


    /*@RequestMapping("list")
    def list(){
        new ModelAndView('views/person/list', [persons: Person.list()])
    }*/
}