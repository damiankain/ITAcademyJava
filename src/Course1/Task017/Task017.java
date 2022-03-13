package Course1.Task017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
17. Все элементы массива поделить на значение наибольшего элемента этого массива.
 */
public class Task017 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите необходимое количество элементов массива:");
        int count = Integer.parseInt(reader.readLine());
        int[] array = new int[count];

        System.out.println("Заполняем массив числами...");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println("Сортируем и ищем наибольший элемент...");
        Arrays.sort(array);

        System.out.println("Содержимое массива после сортировки:");
        for (int x : array) {
            System.out.println(x);
        }

        System.out.println("Каждый элемент массива разделенный на наибольший элемент этого массива:");
        for (int j : array) {
            System.out.println((double) j / array[count-1]);
            /*
            нужно приведение к double или получим нули и в конце единицу,
            т.к. меньшее делится на большее и int не видит десятичных значений
             */
        }

    }
}
