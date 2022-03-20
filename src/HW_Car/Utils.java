package HW_Car;

public class Utils implements CarBrands{
    public String getBrand(){
        return getBrandRandom();
    }

    public static void generateCar (int count) {

        // Метод генерирует массив машин по входящему параметру count

        Car[] cars = new Car[count];
        for (int i = 0; i < count-1; i++) {
            cars[i] = new Car();
        }
    }




}
