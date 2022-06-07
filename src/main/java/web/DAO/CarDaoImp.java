package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao{
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(1,"Model1", 111));
        cars.add(new Car(2,"Model2", 222));
        cars.add(new Car(3,"Model3", 333));
        cars.add(new Car(4,"Model4", 444));
        cars.add(new Car(5,"Model5", 555));
    }

    public List<Car> allCars(Integer count){

        if(count == null || count > cars.size()){
        return cars;
        }
        else {
            List<Car> countCars = new ArrayList<>();
            for(int i = 0; i < count; i++){
                countCars.add(cars.get(i));
            }
            return countCars;
        }
    }
}
