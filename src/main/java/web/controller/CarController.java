package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Indexed;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarController {

    private CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping("/cars")
    public String getCarList (@RequestParam(value = "count", defaultValue = "5") Integer count, Model model) {
        model.addAttribute("cars", carService.getCarList(count));
        return "/cars";
    }

}
