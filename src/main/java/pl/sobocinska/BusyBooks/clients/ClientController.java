package pl.sobocinska.BusyBooks.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.sobocinska.BusyBooks.users.JpaUserService;
import pl.sobocinska.BusyBooks.users.User;

import javax.validation.Valid;
import java.util.List;

@Controller
@Transactional
@RequestMapping("/clients")
public class ClientController {
    private final JpaClientService service;
    private final JpaUserService userService;

    @Autowired
    public ClientController(JpaClientService service, JpaUserService userService) {
        this.service = service;
        this.userService = userService;
    }

    @ModelAttribute("users")
    public List<User> getUsers() {
        return userService.findUsers();
    }




    @GetMapping("")
    public String showClients(Model model) {
        model.addAttribute("clients", service.findClients());
        return "client/clients";
    }

    @GetMapping("/add")
    public String addClientForm(Model model) {
        model.addAttribute("client", new Client());
        return "/client/form";
    }

    @PostMapping("/add")
    public String addClientSave(@Valid Client client, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("clients", service.findClients());
            return "/client/form";
        }
        service.createClient(client);
        return "redirect:/clients";
    }

    @GetMapping("/edit/{id}")
    public String editClient(@PathVariable Long id, Model model) {
        model.addAttribute("client", service.findClientById(id));
        return "client/form";
    }

    @PostMapping("/edit/{id}")
    public String editClient(@Valid Client client, BindingResult result) {
        if (result.hasErrors()) {
            return "/client/form";
        }
        service.editClient(client);
        return "redirect:/clients";
    }

    @GetMapping("/confirm/{id}")
    public String deleteClient(Model model, @PathVariable Long id) {
        Client client = service.findClientById(id);
        model.addAttribute("client", client);
        return "client/confirm";
    }

    @GetMapping("/remove/{id}")
    public String deleteClient(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        service.deleteClient(id);
        redirectAttributes.addFlashAttribute("message", "Usunięto poprawnie");
        return "redirect:/clients";
    }


}
