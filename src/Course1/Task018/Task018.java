package Course1.Task018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
18. Напишите метод переводящий рубли в доллары по заданному курсу.
В качестве аргументов укажите кол-во рублей и курс.
 */
public class Task018 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите желаемый курс доллара по отношению к рублю:");
        double coefficient = Double.parseDouble(reader.readLine());

        System.out.println("Сколько рублей вы хотите потратить?");
        int rubles = Integer.parseInt(reader.readLine());

        exchange(coefficient, rubles);
    }

    public static void exchange(double coefficient, int rubles) {

        System.out.println("Вы получите " + rubles / coefficient + " долларов.");

    }
}
