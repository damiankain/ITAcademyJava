package HW_Car;

public interface CarBrands {

    String[] BRANDS = {"Audi", "Mercedes", "BMW", "Toyota", "Nissan", "Lada", "ЗАЗ", "Subaru", "AlfaRomeo", "Ford"};

    //Интерфейс генерирует бренд автомобиля
    default String getRandomBrand() {
        String[] brands = BRANDS;
        int n = (int) Math.floor(Math.random() * brands.length);
        return brands[n];
    }
}

