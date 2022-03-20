package HW_Car;

import java.util.Arrays;

public class Utils {

    public static Car[] generateCars(int count) {

        // Метод генерирует массив машин по входящему параметру count

        Car[] cars = new Car[count];
        for (int i = 0; i < count; i++) {
            cars[i] = new Car();
        }
        return cars;
    }

    public static void sort(Car[] cars) {
        Arrays.sort(cars);
    }

}
