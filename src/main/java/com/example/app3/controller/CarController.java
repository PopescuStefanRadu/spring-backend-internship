package com.example.app3.controller;

import com.example.app3.model.CarModel;
import com.example.app3.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/car")
public class CarController {

    private CarService carService;

    public CarController(final CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/home")
    public String getCarHomepage(Model model) {
        model.addAttribute("allCars", carService.getAllCars());
        model.addAttribute("carModel", new CarModel()); //id=null, name=null, color=null
        return "carHomepage";
    }

    @PostMapping("/save")
    public String saveCar(@ModelAttribute CarModel carModel) {
        carService.save(carModel);

        return "redirect:/car/home";
    }
}
