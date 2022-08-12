package uz.jl.todoapp.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author "Elmurodov Javohir"
 * @since 11/08/22/11:49 (Thursday)
 * myschoool/IntelliJ IDEA
 */

@Controller
public class HomeController {

    @GetMapping
    public String homePage() {
        return "home";
    }

}
