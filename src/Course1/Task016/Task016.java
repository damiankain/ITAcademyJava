package Course1.Task016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
16. Вывести на экран ряд натуральных чисел от минимума до
максимума с шагом. Например, если минимум 10, максимум 35,
шаг 5, то вывод должен быть таким: 10 15 20 25 30 35. Минимум,
максимум и шаг указываются пользователем (можно захардкодить).
*/
public class Task016 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите минимальное число:");
        int one = Integer.parseInt(reader.readLine());

        System.out.println("Введите максимальное число:");
        int two = Integer.parseInt(reader.readLine());

        System.out.println("Введите шаг чисел:");
        int step = Integer.parseInt(reader.readLine());

        for (int i = one; i <= two;) {
            System.out.println(i);
            i += step;
        }
    }
}
