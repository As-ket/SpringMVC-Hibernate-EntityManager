package dao;

import model.Car;

import java.util.Arrays;
import java.util.List;

public class CarDaoImpl implements CarDao {
    List<Car> cars = Arrays.asList(
            (new Car("Focus", "Coupe", 2008))
            , (new Car("Cerato", "Sedan", 2019))
            , (new Car("Priora", "Universal", 2012))
            , (new Car("Navara", "Pickup", 2009))
            , (new Car("XC90", "SUV", 2016)));

    @Override
    public List<Car> getCars(int count) {
        if (count <= 5) {
            return cars.subList(0, count);
        }
        return cars;
    }

}
