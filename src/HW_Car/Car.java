package HW_Car;

import java.util.Objects;

public class Car implements Movable, CarBrands, Comparable<Car> {

    private int engine;
    private int doors;
    private int wheels;
    private int places;
    private int lights;
    private String model;
    private String brand;

    public Car() {
        this.engine = 1;
        this.doors = 4;
        this.wheels = 4;
        this.places = 5;
        this.lights = 4;
        this.model = "model";
        this.brand = getRandomBrand();

    }

    public Car(int engine, int doors, int wheels, int places, int lights, String model, String brand) {
        this.engine = engine;
        this.doors = doors;
        this.wheels = wheels;
        this.places = places;
        this.lights = lights;
        this.model = model;
        this.brand = brand;
    }

    public int getEngine() { return engine; }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public int getLights() {
        return lights;
    }

    public void setLights(int lights) {
        this.lights = lights;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return engine == car.engine && doors == car.doors && wheels == car.wheels && places == car.places && lights == car.lights && Objects.equals(model, car.model) && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, doors, wheels, places, lights, model, brand);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", doors=" + doors +
                ", wheels=" + wheels +
                ", places=" + places +
                ", lights=" + lights +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Начинаем движение");
    }

    @Override
    public void light() {
        System.out.println("Светим фарами");
    }

    @Override
    public int compareTo(Car car) {
        return brand.compareTo(car.getBrand());
    }

}
