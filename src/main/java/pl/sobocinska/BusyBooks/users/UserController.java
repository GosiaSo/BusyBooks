package pl.sobocinska.BusyBooks.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/admin/users")
@Transactional
public class UserController {
    private final JpaUserService service;

    @Autowired
    public UserController(JpaUserService service) {
        this.service = service;
    }


    @GetMapping("")
    public String showUsers(Model model) {
        model.addAttribute("users", service.findUsers());
        return "user/users";
    }

    @GetMapping("/add")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "/user/form";
    }

    @PostMapping("/add")
    public String addUser(@Valid User user, BindingResult result, Model model){
        if (result.hasErrors()) {
            model.addAttribute("users", service.findUsers());
            return "/user/form";
        }
        service.createUser(user);
        return "redirect:/admin/users";
    }

    @GetMapping("/edit/{id}")
    public String editUserForm(@PathVariable Long id, Model model){
        model.addAttribute("user", service.findUserById(id));
        return "user/form";
    }

    @PostMapping("/edit/{id}")
    public String editUserSave(@Valid User user, BindingResult result){
        if(result.hasErrors()){
            return "/user/form";
        }
        service.editUser(user);
        return "redirect:/admin/users";
    }

    @GetMapping("/confirm/{id}")
    public String deleteUser(Model model, @PathVariable Long id) {
        User user = service.findUserById(id);
        model.addAttribute("user", user);
        return "user/confirm";
    }
    @GetMapping("/remove/{id}")
    public String deleteUser(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        service.deleteUser(id);
        redirectAttributes.addFlashAttribute("message","Usunięto poprawnie");
        return "redirect:/admin/users";
    }
}
