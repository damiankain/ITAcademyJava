package Course1.Task014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 14. Создайте программу с двумя переменными целого типа,
присвойте им значения, если первая переменная больше второй,
то увеличьте её значение на 3, иначе увеличьте значение второй
переменной на 8. В конце программы выведите значения обоих
чисел на экран.*/
public class Task014 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число:");
        int a = Integer.parseInt(reader.readLine());

        System.out.println("Введите второе число:");
        int b = Integer.parseInt(reader.readLine());

        if (a > b) {
            a = a + 3;
        } else {
            b = b + 8;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
