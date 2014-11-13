package com.springapp.app.welcome;

import com.springapp.domain.model.Todo;
import com.springapp.domain.service.todo.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {

    @Inject
    TodoService todoService;

    @ModelAttribute("todos")
    public List<Todo> getTodos(){
        return todoService.getTodos();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "hello";
    }
}