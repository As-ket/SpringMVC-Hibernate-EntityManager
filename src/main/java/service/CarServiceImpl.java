package service;

import dao.CarDao;
import dao.CarDaoImpl;
import model.Car;
import java.util.List;

public class CarServiceImpl implements CarService {

    private final CarDao carDao = new CarDaoImpl();


    @Override
    public List<Car> getCars(int count) {
        List<Car> carInWeb = carDao.getCars();
        if (count <= 5 && count > 0) {
            return carDao.getCars().subList(0, count);
        } else if (count <= 0) {
            return null;
        }
        return carInWeb;
    }
}
