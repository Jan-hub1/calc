package com.akademia.calculator.controller;


import com.akademia.calculator.model.Device;
import com.akademia.calculator.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MainController {

    private final CalculateService calculateService;

    public MainController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping("/device")
    public String greeting(Model model){
        model.addAttribute("device", new Device());
        return "greeting";

    }


    @PostMapping("/device")
    public String greetingSubmit(@ModelAttribute Device device) {
        calculateService.calculatePrice(device);
        return "result";
    }


}
