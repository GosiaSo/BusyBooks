package pl.sobocinska.BusyBooks;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/home", ""})
    public String showHomePage() {
    return "/home";
    }
}