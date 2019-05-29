package com.example.JxSpringTuto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccueilController {

    @RequestMapping("/sayhello")
    String home() {
        return "Hello World!";
    }


    @RequestMapping("/sayi")
    String sayI() {
        return "Hy mister!";
    }

    @RequestMapping("/saybye")
    String sayBye() {
        return "Bye mister !";
    }

//    @RequestMapping("/saygoodby")
//    String saygoodby() {
//        return "Bye mister !";
//    }
}
