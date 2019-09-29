package com.akademia.calculator.controller;


import com.akademia.calculator.model.Device;
import com.akademia.calculator.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    CalculateService calculateService;

    @GetMapping("/")
    @ResponseBody
    public String greeting(){
        Device device = new Device(1450L);
        calculateService.calculatePrice(device);
        return "Cennik: " + "Cena za dzień: " + device.getPriceForDay()
                + ", Cena za godzinę: " + device.getPriceForHour();

    }


}
