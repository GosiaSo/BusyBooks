package pl.sobocinska.BusyBooks.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/users")
@Transactional
public class UserController {

    private final JpaUserService service;

    @Autowired
    public UserController(JpaUserService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String showUsers(Model model) {
        model.addAttribute("users", service.findUsers());
        return "/user/users";
    }
}
