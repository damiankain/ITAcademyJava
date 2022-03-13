package Course1.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {

        multiply10per();

    }

    public static void multiply10per() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите необходимое количество элементов массива:");
        int count = Integer.parseInt(reader.readLine());
        int[] array = new int[count];

        System.out.println("Заполняем массив числами...");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println("Содержимое массива после заполнения числами:");
        for (int x : array) {
            System.out.println(x);
        }

        System.out.println("Содержимое массива после увеличения на 10%:");
        for (double x: array) {
            System.out.println(x * 1.1);
        }
    }
}

