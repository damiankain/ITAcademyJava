package HW_Car;

public interface CarBrands {

    //Интерфейс генерирует бренд автомобиля

     default String getBrandRandom() {
        String[] brands = new String[]{"Audi", "Mercedes", "BMW", "Toyota", "Nissan", "Lada", "ЗАЗ", "Subaru", "AlfaRomeo", "Ford"};
         int n = (int)Math.floor(Math.random() * brands.length);
         return brands[n];

    }

}
