package pl.sobocinska.BusyBooks.invoices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.sobocinska.BusyBooks.clients.Client;
import pl.sobocinska.BusyBooks.clients.JpaClientService;
import pl.sobocinska.BusyBooks.statusInvoice.JpaStatusInvoiceService;
import pl.sobocinska.BusyBooks.statusInvoice.StatusInvoiceDictionary;

import javax.validation.Valid;
import java.util.List;

@Controller
@Transactional
@RequestMapping("/invoices")
public class InvoiceController {
    private final JpaInvoiceService service;
    private final JpaClientService clientService;
    private final JpaStatusInvoiceService statusInvoiceService;

    @Autowired
    public InvoiceController(JpaInvoiceService service, JpaClientService clientService, JpaStatusInvoiceService statusInvoiceService) {
        this.service = service;
        this.clientService = clientService;
        this.statusInvoiceService = statusInvoiceService;
    }

    @ModelAttribute("clients")
    public List<Client> getClients(){
        return clientService.findClients();
    }

    @ModelAttribute("status")
    public List <StatusInvoiceDictionary> getStatus(){
        return statusInvoiceService.findStatus();
    }


    @GetMapping("")
    public String showInvoices(Model model){
        model.addAttribute("invoices", service.findInvoices());
        return "invoice/invoices";
    }

    @GetMapping("/add")
    public String addInvoiceForm(Model model){
        model.addAttribute("invoice", new Invoice());
        return "/invoice/form";
    }

    @PostMapping("/add")
    public String addInvoiceSave(@Valid Invoice invoice, BindingResult result, Model model){
        if(result.hasErrors()){
            model.addAttribute("invoices", service.findInvoices());
            return "/invoice/form";
        }
        service.createInvoice(invoice);
        return "redirect:/invoices";
    }

    @GetMapping("/edit/{id}")
    public String editInvoice(@PathVariable Long id, Model model){
        model.addAttribute("invoice", service.findInvoiceById(id));
        return "/invoice/form";
    }

    @PostMapping("/edit/{id}")
    public String editInvoice(@Valid Invoice invoice, BindingResult result, Model model){
        if(result.hasErrors()){
            return "/invoice/form";
        }
        service.editInvoice(invoice);
        return "redirect:/invoices";
    }

    @GetMapping("/confirm/{id}")
    public String deleteInvoice(Model model, @PathVariable Long id){
        Invoice invoice = service.findInvoiceById(id);
        model.addAttribute("invoice", invoice);
        return "invoice/confirm";
    }

    @GetMapping("/remove/{id}")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    public String deleteInvoice(@PathVariable Long id, RedirectAttributes redirectAttributes){
        service.deleteInvoice(id);
        redirectAttributes.addFlashAttribute("message", "Usunięto poprawnie");
        return "redirect:/invoices";
    }
}

