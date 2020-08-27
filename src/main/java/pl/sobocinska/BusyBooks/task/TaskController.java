package pl.sobocinska.BusyBooks.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.sobocinska.BusyBooks.clients.Client;
import pl.sobocinska.BusyBooks.clients.JpaClientService;
import pl.sobocinska.BusyBooks.statusTask.JpaStatusTaskService;
import pl.sobocinska.BusyBooks.statusTask.StatusTaskDictionary;
import pl.sobocinska.BusyBooks.taskDictionary.JpaTaskDictService;
import pl.sobocinska.BusyBooks.taskDictionary.TasksDictionary;

import javax.validation.Valid;
import java.util.List;

@Controller
@Transactional
@RequestMapping("/tasks")
public class TaskController {
    private final JpaTaskService service;
    private final JpaClientService clientService;
    private final JpaTaskDictService taskDictService;
    private final JpaStatusTaskService statusTaskService;

    @Autowired
    public TaskController(JpaTaskService service, JpaClientService clientService, JpaTaskDictService taskDictService, JpaStatusTaskService statusTaskService) {
        this.service = service;
        this.clientService = clientService;
        this.taskDictService = taskDictService;
        this.statusTaskService = statusTaskService;
    }

    @ModelAttribute("clients")
    public List<Client> getClients(){
        return clientService.findClients();
    }

    @ModelAttribute("tasksDict")
    public List <TasksDictionary> getTasksDict(){
        return taskDictService.findTask();
    }

    @ModelAttribute("status")
    public List <StatusTaskDictionary> getStatus(){
        return statusTaskService.findStatus();
    }

    @GetMapping("")
    public String showTasks(Model model){
        model.addAttribute("tasks", service.findTasks());
        return "task/tasks";
    }


    @GetMapping("/add")
    public String addTaskForm(Model model){
        model.addAttribute("task", new Task());
        return "/task/form";
    }

    @PostMapping("/add")
    public String addTaskSave(@Valid Task task, BindingResult result, Model model){
        if(result.hasErrors()){
            model.addAttribute("tasks", service.findTasks());
            return "/task/form";
        }
        service.createTask(task);
        return "redirect:/tasks";
    }

    @GetMapping("/edit/{id}")
    public String editTask(@PathVariable Long id, Model model){
        model.addAttribute("task", service.findTaskById(id));
        return "task/form";
    }

    @PostMapping("/edit/{id}")
    public String editTask(@Valid Task task, BindingResult result, Model model){
        if(result.hasErrors()){
            return "/task/form";
        }
        service.editTask(task);
        return "redirect:/tasks";
    }

    @GetMapping("/confirm/{id}")
    public String deleteTask(Model model, @PathVariable Long id){
        Task task = service.findTaskById(id);
        model.addAttribute("tasks", task);
        return "task/confirm";
    }

    @GetMapping("/remove/{id}")
    public String deleteTask(@PathVariable Long id, RedirectAttributes redirectAttributes){
        service.deleteTask(id);
        redirectAttributes.addFlashAttribute("message", "Usunięto poprawnie");
        return "redirect:/tasks";
    }
}
