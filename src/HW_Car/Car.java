package HW_Car;

public class Car implements Movable, CarBrands{
    private int engine;
    private int doors;
    private int wheels;
    private int places;
    private int lights;

    private String brand = getBrandRandom();
    private String model;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = getBrandRandom();
    }



    public Car(int engine, int doors, int wheels, int places, int lights) {
        this.engine = engine;
        this.doors = doors;
        this.wheels = wheels;
        this.places = places;
        this.lights = lights;
        System.out.println("1");
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println("2");
    }

    public Car() {
        this.brand = brand;
        System.out.println(brand);
        move();
        light();
    }




    // Реализовали методы интерфейса Movable
    @Override
    public void move() {
        System.out.println("Машина едет.");
    }

    @Override
    public void light() {
        System.out.println("Машина светит фарами.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
