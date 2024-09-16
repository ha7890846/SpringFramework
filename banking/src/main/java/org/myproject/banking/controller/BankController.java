package org.myproject.banking.controller;

import org.myproject.banking.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController {

    @Autowired
    private BankService bankService;
    
    @GetMapping("/home")
    public String getHomePage() {
        return "home";  // This will render the home.html file
    }
    
    // RESTful URL to display branches in Bangalore
    @GetMapping("/branches")
    public String getBranches(Model model) {
        String bankName = "Bank of Bangalore";
        model.addAttribute("bankName", bankName);
        model.addAttribute("branches", bankService.getBranches());
        return "branches";  // This will render 'branches.html'
    }

    // RESTful URL to display services provided by the bank
    @GetMapping("/services")
    public String getServices(Model model) {
        String bankName = "Bank of Bangalore";
        model.addAttribute("bankName", bankName);
        model.addAttribute("services", bankService.getServices());
        return "services";  // This will render 'services.html'
    }
}
