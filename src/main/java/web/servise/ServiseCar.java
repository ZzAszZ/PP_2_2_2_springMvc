package web.servise;

import web.model.Car;

import java.util.List;

public interface ServiseCar {
    List<Car> allCars(Integer count);
}
