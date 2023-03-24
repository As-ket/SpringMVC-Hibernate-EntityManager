package model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Focus", "Coupe", 2008));
        cars.add(new Car("Cerato", "Sedan", 2019));
        cars.add(new Car("Priora", "Universal", 2012));
        cars.add(new Car("Navara", "Pickup", 2009));
        cars.add(new Car("XC90", "SUV", 2016));
    }
    private String model;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", body='" + body + '\'' +
                ", modelYear=" + modelYear +
                '}';
    }

    private String body;
    private int modelYear;

    public Car(String model, String body, int modelYear) {
        this.model = model;
        this.body = body;
        this.modelYear = modelYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }


}
