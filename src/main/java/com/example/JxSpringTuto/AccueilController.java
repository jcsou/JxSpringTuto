package com.example.JxSpringTuto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccueilController {

    @RequestMapping("/sayhello")
    String home() {
        return "Hello World!";
    }


    @RequestMapping("/sayI")
    String sayI() {
        return "Hy mister!";
    }

    @RequestMapping("/sayItoDA")
    String sayItoDA() {
        return "Hy mister Denis A!";
    }

    @RequestMapping("/sayBye")
    String sayBye() {
        return "Bye mister !";
    }
}
