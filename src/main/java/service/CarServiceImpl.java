package service;

import dao.CarDao;
import dao.CarDaoImpl;
import model.Car;
import java.util.List;

public class CarServiceImpl implements CarService {

    private final CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}
