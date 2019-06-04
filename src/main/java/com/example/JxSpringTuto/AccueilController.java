package com.example.JxSpringTuto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class AccueilController {

    @RequestMapping("/")
    void accueil(HttpServletResponse response) throws IOException {
        response.sendRedirect("./sayi");
    }

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

    @RequestMapping("/saygoodnight")
    String saygoodnight() {
        return "say good night mister !";
    }

    @RequestMapping("/saygoodby")
    String saygoodby() {
        return "Bye mister !";
    }
}
