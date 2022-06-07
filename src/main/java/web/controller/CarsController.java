package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servise.ServiseCar;
import web.servise.ServiseCarImp;


@Controller
public class CarsController {
    private ServiseCar serviseCar;

    public CarsController(ServiseCar serviseCar) {
        this.serviseCar = serviseCar;
    }

    @GetMapping("/car")
    public String allCars(@RequestParam(value = "count", required = false) Integer count, Model model){
       model.addAttribute("cars",serviseCar.allCars(count));
        return "car";
     }

}
