package web.servise;

import org.springframework.stereotype.Component;
import web.DAO.CarDao;
import web.model.Car;

import java.util.List;

@Component
public class ServiseCarImp implements ServiseCar{
    private CarDao carDao;

    public ServiseCarImp(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> allCars(Integer count){
        return carDao.allCars(count);
    }
}
