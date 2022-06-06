package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDAO;
import web.model.Car;

import java.util.List;


@Controller
public class CarsController {
    private CarDAO carDAO;

    public CarsController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping("/car")
    public String allCars(@RequestParam(value = "count", required = false) Integer count, Model model){
       model.addAttribute("cars",carDAO.allCars(count));
        return "car";
     }

}
