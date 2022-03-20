package HW_Car;

import static HW_Car.Utils.generateCars;
import static HW_Car.Utils.sort;

public class Main {
    public static void main(String[] args) {
        Car[] cars = generateCars(10);
        sort(cars);
        for (Car car : cars) {
            System.out.println(car);
        }
    }

}
