package model;

public class Car {

    private String model;
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

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", body='" + body + '\'' +
                ", modelYear=" + modelYear +
                '}';
    }


}
