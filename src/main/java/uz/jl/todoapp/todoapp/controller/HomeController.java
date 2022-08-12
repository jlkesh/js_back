package uz.jl.todoapp.todoapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import uz.jl.todoapp.todoapp.repository.TodoRepository;

/**
 * @author "Elmurodov Javohir"
 * @since 11/08/22/11:49 (Thursday)
 * myschoool/IntelliJ IDEA
 */

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final TodoRepository todoRepository;


    @GetMapping
    public ModelAndView homePage() {
        ModelAndView modelAndView = new ModelAndView("main");
        modelAndView.addObject("todos", todoRepository.findAll());
        return modelAndView;
    }

}
